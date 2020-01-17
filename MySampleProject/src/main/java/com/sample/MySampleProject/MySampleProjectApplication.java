package com.sample.MySampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.java2d.pipe.SpanShapeRenderer;

import javax.print.attribute.standard.Destination;
import java.net.URL;

@SpringBootApplication
public class MySampleProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(MySampleProjectApplication.class, args);
		EmployeeDTO employeeDTO = new EmployeeDTO();
		SimpleDestination destination = new SimpleDestination();
		destination.getDescription();
		destination.getName();


	}

}
