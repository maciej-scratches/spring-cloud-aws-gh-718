package com.example.springcloudawss3sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(S3Properties.class)
public class SpringCloudAwsS3SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAwsS3SampleApplication.class, args);
    }
}
