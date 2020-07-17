package com.teste2.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class Transitar {
    @GetMapping("/aula2")
    public String aula2(){
        return "aula2";
    }
    
    @GetMapping("/aula3")
    public String aula3(){
        return "aula3";
    }
}