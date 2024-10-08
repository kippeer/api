package com.eventostec.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {
    @Value("${aws.region}")
    private String awsRegion;

    @Bean
    public AmazonS3 createS3Instance(){
        return AmazonS3ClientBuilder
                .standard()
                .withRegion(awsRegion)
                .build();
    }
}
