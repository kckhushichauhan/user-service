package com.shreegajanana.technologies.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@Value("${user.role}")
    private String userRole;

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/config")
    public String getConfig() {
    	System.out.println(String.format("Role: %s, Message: %s", userRole, welcomeMessage));
        return String.format("Role: %s, Message: %s", userRole, welcomeMessage);
    }

}
