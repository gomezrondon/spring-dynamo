package com.gomezrondon.springdynamo.controller;


import com.gomezrondon.springdynamo.model.Movie;
import com.gomezrondon.springdynamo.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/movies")
    public ResponseEntity<Movie> insertMovie(@RequestBody Movie movie) {

        if (movie != null) {
            movieService.insertMovie(movie);
        }


        return new ResponseEntity<>(movie, HttpStatus.ACCEPTED);
    }

}
