package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	@Autowired
	@Qualifier("java")
	private ICourseMaterial material;
	
	public void preparation(String examName) {
		System.out.println("praparation started for "+examName);
		String courseContent=material.courseContents();
		double priece=material.priece();
		System.out.println("preparation is going on using "+courseContent+"with price"+priece);
		System.out.println("preparation is completed for "+examName);
		
	}
	
}
