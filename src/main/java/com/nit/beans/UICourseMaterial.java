package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("UI")
public class UICourseMaterial implements ICourseMaterial {
	public UICourseMaterial(){
		System.out.println("UICourseMaterial:0 param constructor");
	}
	@Override
	public String courseContents() {
		System.out.println("UICourseMaterial: courseContent methods");
		return "01:html,02:css,03:javascript";	
	}

	@Override
	public double priece() {
		System.out.println("UICourseMaterial:price method");
		return 200;
	}

}
