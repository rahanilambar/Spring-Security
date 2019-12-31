/**
 * @Author Nilambar Raha
 */

package com.antech.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Login {
    
    @GetMapping("/data")
    public String Login(){
        return "Welcome";
    }
    
//    @GetMapping("/user")
//    public String User(){
//        return "Welcome user";
//    }
//    
//    @GetMapping("/admin")
//    public String Admin(){
//        return "Welcome admin";
//    }
    
    @GetMapping("/some")
    public String fake(){
        return "Fake data";
    }
}
