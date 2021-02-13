package com.gomezrondon.springdynamo.controller;


import com.gomezrondon.springdynamo.model.Movie;
import com.gomezrondon.springdynamo.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DynamoController {

    private final MovieService movieService;

    public DynamoController(MovieService service) {
        this.movieService = service;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> allMovies = movieService.getAllMovies();

        return new ResponseEntity<>(allMovies, HttpStatus.OK);
    }
}
