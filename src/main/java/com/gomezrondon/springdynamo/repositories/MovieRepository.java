package com.gomezrondon.springdynamo.repositories;


import com.gomezrondon.springdynamo.model.Movie;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface MovieRepository extends CrudRepository<Movie, String> {
}
