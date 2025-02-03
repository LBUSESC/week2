package com.sesc.unistudycircle;

import com.sesc.unistudycircle.dependency.ShapeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=  SpringApplication.run(SpringDiDemoApplication.class, args);
		ShapeService shapeService = applicationContext.getBean(ShapeService.class);
		shapeService.printShape();
	}

}
