package com.gomezrondon.springdynamo.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DynamoController {


    @GetMapping("/movies")
    public ResponseEntity<Map<String, Object>> getAllMovies(@RequestHeader HttpHeaders headers) {

        return null;
    }
}
