package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("dot")
public class DotNetCourseMaterial implements ICourseMaterial {
	public DotNetCourseMaterial(){
		System.out.println("DotNetCourseMaterial:0 param constructor");
	}
	@Override
	public String courseContents() {
		System.out.println("DotNetCourseMaterial: courseContent methods");
		return "01:C#oops,02:C#ExceptionHandling,03:CCollection";	
	}

	@Override
	public double priece() {
		System.out.println("DotNetCourseMaterial:price method");
		return 300;
	}

}
