
package com.example.micro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @GetMapping("/users/hello")
    public String hello(){
        return "Hello from user service!";

    }

    
}
