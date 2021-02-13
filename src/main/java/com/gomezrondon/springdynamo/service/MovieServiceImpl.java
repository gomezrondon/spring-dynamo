package com.gomezrondon.springdynamo.service;

import com.gomezrondon.springdynamo.model.Movie;
import com.gomezrondon.springdynamo.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;

    public MovieServiceImpl(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Movie> getAllMovies() {

        List<Movie> collect = StreamSupport.stream(repository.findAll().spliterator(), true).collect(Collectors.toList());

        return collect;
    }

    @Override
    public Movie insertMovie(Movie movie) {
        return repository.save(movie);
    }

    @Override
    public Movie update(Movie movie) {
        return repository.save(movie);
    }


}
