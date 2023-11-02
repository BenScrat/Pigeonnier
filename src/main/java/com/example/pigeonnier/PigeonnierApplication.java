package com.example.pigeonnier;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PigeonnierApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PigeonnierApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
