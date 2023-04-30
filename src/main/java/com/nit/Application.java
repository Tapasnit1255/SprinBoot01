package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.beans.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//get target spring bean class object
		Student st=ctx.getBean("std",Student.class);
		//invoke b.method
		st.preparation("java interview");
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
