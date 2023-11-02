package com.example.pigeonnier;

import com.example.pigeonnier.bll.PigeonManager;
import com.example.pigeonnier.bo.Pigeon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PigeonnierApplication implements CommandLineRunner {
    @Autowired
    PigeonManager PigeonManager;

    public static void main(String[] args) {
        SpringApplication.run(PigeonnierApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Pigeon Ricardo = new Pigeon( "Ricardo", "Rade", "4");
        Pigeon Bombe = new Pigeon( "Bombe", "Kylian", "5");
        Pigeon Hendrick = new Pigeon( "Hendrick", "Pigeon", "6");

        PigeonManager.addPigeon(Ricardo);
        PigeonManager.addPigeon(Bombe);
        PigeonManager.addPigeon(Hendrick);


    }
}
