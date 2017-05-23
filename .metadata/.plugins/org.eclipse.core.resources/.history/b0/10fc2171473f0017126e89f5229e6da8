package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/")
    public  ModelAndView root_test(ModelAndView model) throws Exception{
		model.setViewName("body/body");
        return model;
    }
}
