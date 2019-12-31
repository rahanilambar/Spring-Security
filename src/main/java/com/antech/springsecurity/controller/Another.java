/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antech.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nilambar
 */

@RequestMapping("/admin/batch")
public class Another{
    
    @GetMapping("/data")
    public String other(){
        return "Hello admin";
    }
    
}
