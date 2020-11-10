package com.example.springcloudawss3sample;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);

    @Autowired
    private Environment env;

    @Bean
    public AmazonS3 amazonS3(S3Properties s3Properties) {
        // just for the sake of testing
        if (env == null) {
            throw new RuntimeException("environment is null when creating amazonS3 bean");
        }
        if (s3Properties == null) {
            throw new RuntimeException("s3Properties is null when creating amazonS3 bean");
        }
        if (s3Properties.getEnablePathStyleAccess() == null) {
            throw new RuntimeException("s3Properties#enablePathStyleAccess is null when creating amazonS3 bean");
        }

        LOGGER.info("Environment: {}", env);
        LOGGER.info("S3Properties: {}", s3Properties);

        AmazonS3ClientBuilder builder = AmazonS3ClientBuilder.standard();
        builder.enablePathStyleAccess();
        AmazonS3 amazonS3 = builder.build();
        return amazonS3;
    }

}
