package com.tientranzt.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tientranzt.entity.Employee;

@Controller
public class HomePageController {
	
	
	@RequestMapping("/")
	@ResponseBody
	public String homePage() {
	
		ApplicationContext context =  new ClassPathXmlApplicationContext("IoC.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.getMessage();
		((ClassPathXmlApplicationContext) context).close();
		
		return "home page !";

	}

}
