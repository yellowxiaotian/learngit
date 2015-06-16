package com.shangcent.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/index")
    public String index(){
		logger.error("≤‚ ‘log»’÷æ" + "index");
        return "index";
    }
}
