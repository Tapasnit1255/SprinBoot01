package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements ICourseMaterial {
	public JavaCourseMaterial(){
		System.out.println("JavaCourseMaterial:0 param constructor");
	}
	@Override
	public String courseContents() {
		System.out.println("JavaCourseMaterial: courseContent methods");
		return "01:oops,02:ExceptionHandling,03:Collection";	
	}

	@Override
	public double priece() {
		System.out.println("JavaCourseMaterial:price method");
		return 400;
	}

}
