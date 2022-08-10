package com.example.demo.AdminController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class AdminController {
	@GetMapping("/admin")
    public String adminHome() { 

   	 return "This is the Admin Controller in featureA Branch"; 
    
    }
}
