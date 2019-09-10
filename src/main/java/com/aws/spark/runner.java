package com.aws.spark;

import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class runner implements CommandLineRunner {

    @Autowired
    private AmazonS3 amazonS3;


    @Override
    public void run(String... args) throws Exception {
        amazonS3.createBucket("haha");
    }
}
