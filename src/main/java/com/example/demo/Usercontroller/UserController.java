package com.example.demo.Usercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class UserController {
	@GetMapping("/user")
    public String userHome() { 

   	 return "This is the User Controller in Master Branch"; 
    
    }
}
