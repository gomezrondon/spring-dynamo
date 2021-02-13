package com.gomezrondon.springdynamo;


import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories(basePackages = "com.gomezrondon.springdynamo.repositories")
public class DynamoConfig {

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {

        AmazonDynamoDB dynamoDB =  AmazonDynamoDBClientBuilder
                .standard().withRegion(Regions.US_EAST_1)
                .build();

        return dynamoDB;
    }

}
