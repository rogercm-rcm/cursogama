package br.martins.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // http://localhost:8080/hello
public class HelloController {
        
    @GetMapping("/primeiro") // http://localhost:8080/hello/primeiro
    public String getHello() {
        return "Meu primeiro projeto";
    }
}
