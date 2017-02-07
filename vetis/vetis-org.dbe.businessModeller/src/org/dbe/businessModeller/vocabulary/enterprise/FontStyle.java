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
 * Modified 2009.10.04 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.enterprise;

import org.dbe.businessModeller.BusinessModeller;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class FontStyle {
	
	private int type;
	private Color color;
	private boolean underlined;
	private boolean doubleUnderlined;
	private boolean italic;
	private boolean bold;
	
	public FontStyle (int type){
		this.type=type;
		switch (type){
			case BusinessModeller.TERM:
				this.color = new Color(Display.getDefault(), new RGB(0,128,128));
				this.underlined = true;
				this.doubleUnderlined = false;
				this.italic = false;
				this.bold = false;
				break;
			case BusinessModeller.NAME:
				this.color = new Color(Display.getDefault(), new RGB(4,79,4));
				this.underlined = true;
				this.doubleUnderlined = false;
				this.italic = false;
				this.bold = false;
				break;	
			case BusinessModeller.VERB:
				this.color = new Color(Display.getDefault(), new RGB(0,0,255));
				this.underlined = false;
				this.doubleUnderlined = false;
				this.italic = true;
				this.bold = false;
				break;
			case BusinessModeller.KEYWORD:
				this.color = new Color(Display.getDefault(), new RGB(255,101,0));
				this.underlined = false;
				this.doubleUnderlined = false;
				this.italic = false;
				this.bold = false;
				break;
			case BusinessModeller.TAG:
				this.color = new Color(Display.getDefault(), new RGB(128,128,128));
				this.underlined = false;
				this.doubleUnderlined = false;
				this.italic = false;
				this.bold = false;
				break;
			case BusinessModeller.ERROR:
				this.color = new Color(Display.getDefault(), new RGB(255,0,0));
				this.underlined = true;
				this.doubleUnderlined = false;
				this.italic = true;
				this.bold = true;
				break;
			case BusinessModeller.COMMENT:
				this.color = new Color(Display.getDefault(), new RGB(51,153,0));
				this.underlined = false;
				this.doubleUnderlined = false;
				this.italic = false;
				this.bold = false;
				break;
			case BusinessModeller.RULESET:
				this.color = new Color(Display.getDefault(), new RGB(51,153,0));
				this.underlined = false;
				this.doubleUnderlined = false;
				this.italic = false;
				this.bold = true;
				break;
			default: //case BusinessModeller.DEFAULT_STYLE:
				this.color = new Color(Display.getDefault(), new RGB(0,0,0));
				this.underlined = false;
				this.doubleUnderlined = false;
				this.italic = false;
				this.bold = false;
				break;
		}
	}//costruttore
	
	public FontStyle(){
		this(BusinessModeller.DEFAULT_STYLE);
	}//costruttore

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean isBold() {
		return bold;
	}

	public Color getColor() {
		return color;
	}

	public boolean isDoubleUnderlined() {
		return doubleUnderlined;
	}

	public boolean isItalic() {
		return italic;
	}

	public boolean isUnderlined() {
		return underlined;
	}
}
