package com.in28minutes.springboot;


import com.in28minutes.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    private WelcomeService service;
    @RequestMapping("/welcome")
    public String welcome()
    {
        return service.retrieveMessage();
    }
}

