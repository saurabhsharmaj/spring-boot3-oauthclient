package com.example.springsecurityrestclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@AllArgsConstructor
public class TestController {

    @Autowired
    private RestClient restClientPassword;
    

    @GetMapping("/products")
    public String restClientPassword() {
//        log.info("restClientPassword called");
        return restClientPassword.get().uri("/products").retrieve().body(String.class);
    }
   
    @GetMapping("/products/{id}")
    public String restClientPassword(@PathVariable Long id) {
//        log.info("restClientPassword called");
        return restClientPassword.get().uri("/"+id).retrieve().body(String.class);
    }

}
