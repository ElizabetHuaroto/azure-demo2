package com.upc.forazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ForAzureApplication {

    @GetMapping("/message")
    public String message(){
        return "felicitaciones si funciona";
    }
    public static void main(String[] args) {
        SpringApplication.run(ForAzureApplication.class, args);
    }

}
