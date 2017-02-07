/*******************************************************************************
 * Copyright (c) 2006 DBE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/eclipse-1.0.php
 *
 * Contributors:
 *     Isufi
 *
 * Authors:
 *	Maurizio De Tommasi
 *	Pierpaolo Cira
 *	Valerio Cisternino
 *
 *******************************************************************************/
/*
 * Creato il 25-nov-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.ui.wizards.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class FinishRunnableWithProgress implements IRunnableWithProgress {
	String containerName;
	List fileNames;
	Shell shell;
	
	public FinishRunnableWithProgress(String containerName, List fileNames, Shell shell) {
		this.containerName = containerName;
		this.fileNames = fileNames;
		this.shell = shell;
	}

	public void run(IProgressMonitor monitor) throws InvocationTargetException {
		try {
			doFinish(containerName, fileNames, monitor);
		} catch (CoreException e) {
			throw new InvocationTargetException(e);
		} finally {
			monitor.done();
		}
	}

	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */
	protected void doFinish(String containerName, List fileNames, IProgressMonitor monitor) throws CoreException {
		final int numFile = fileNames.size();
		monitor.beginTask("Creating files on filesystem...", (numFile*2) );
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		Iterator fileNameIterator = fileNames.iterator();
		while(fileNameIterator.hasNext()){
			final FileContentAssociator thisFileContent = (FileContentAssociator)fileNameIterator.next(); 
			final String fileName = thisFileContent.getName();
			final String finalContent = thisFileContent.getContent();
			final IFile file = container.getFile(new Path(fileName));
			try {
				InputStream stream = new ByteArrayInputStream(finalContent.getBytes());
				if (file.exists()) {
					file.setContents(stream, true, true, monitor);
				} else {
					file.create(stream, true, monitor);
				}
				stream.close();
			} catch (IOException e) {
			}
			monitor.worked(1);
			// To not duplicate already opened files
			if(BusinessModellerUtils.isHeadFile(fileName))continue;
			monitor.setTaskName("Opening file for editing...");
			shell.getDisplay().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage page =
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					try {
						IDE.openEditor(page, file, true);
					} catch (PartInitException e) {
					}
				}
			});
			monitor.worked(1);
		}
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.dbe.businessModeller", IStatus.OK, message, null);
		throw new CoreException(status);
	}
}
