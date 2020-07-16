package com.teste2.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class aula1Controller {

    @GetMapping("/")
    public String aula1(){
        return "aula 1";
    }
    
}