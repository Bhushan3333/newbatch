package com.cjc.HomeController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HomeController {

	
	
	@RequestMapping("/getdata")
	public List  datam1()
	{
		
		List l=new ArrayList();
		
		Student s=new Student();
		
		s.setRollno(1);
		s.setName("bhushan");
		
		l.add(s);
		
		return l;
		
	}
}