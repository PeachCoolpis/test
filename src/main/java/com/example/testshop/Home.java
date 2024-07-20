package com.example.testshop;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    
    @GetMapping("/")
    public String home() {
        return "e4i2 도메인";
    }
}
