package com.FactoryApp.FactoryApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blablabla")

public class RestControllerTest {

    @GetMapping
    public ResponseEntity<String> printText(){
        return ResponseEntity.ok("Anything");
    }
}
