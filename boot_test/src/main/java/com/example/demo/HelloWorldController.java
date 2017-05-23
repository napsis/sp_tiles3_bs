package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.HelloWorldService;

@Controller
public class HelloWorldController {
	
	@Autowired
	private HelloWorldService hwService ;
	
	@RequestMapping(value="/")
    public  ModelAndView root_test(ModelAndView model) throws Exception{
		model.setViewName("body/body");
		
		String a = hwService.selectDual();
		System.out.println(a);
        return model;
    }
}
