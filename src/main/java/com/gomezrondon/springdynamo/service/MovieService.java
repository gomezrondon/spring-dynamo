package com.gomezrondon.springdynamo.service;

import com.gomezrondon.springdynamo.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();

    Movie insertMovie(Movie movie);

}
