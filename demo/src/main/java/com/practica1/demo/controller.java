package com.practica1.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller{
   
    @RequestMapping("/hola")
    public String Hello(@RequestParam(value = "name", defaultValue = "Samir")String name){
    return String.format("Hola %s!", name);
   }
}
