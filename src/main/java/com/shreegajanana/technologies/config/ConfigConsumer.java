package com.shreegajanana.technologies.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumer {
	
	@Value("${user.role}")
    private String userRole;

    @Value("${welcome.message}")
    private String welcomeMessage;

    // Getter methods
    public String getUserRole() {
        return userRole;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

}
