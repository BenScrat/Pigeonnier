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

        Pigeon Paul = new Pigeon( "Paul", "BEN", "1");
        Pigeon Tex = new Pigeon( "Tex", "BEN", "2");
        Pigeon Tom = new Pigeon( "Tom", "BEN", "3");
        Pigeon Ricardo = new Pigeon( "Ricardo", "BEN", "4");
        Pigeon Bombe = new Pigeon( "Bombe", "BEN", "5");
        Pigeon Hendrick = new Pigeon( "Hendrick", "BEN", "6");

        PigeonManager.addPigeon(Paul);
        PigeonManager.addPigeon(Tex);
        PigeonManager.addPigeon(Tom);
        PigeonManager.addPigeon(Ricardo);
        PigeonManager.addPigeon(Bombe);
        PigeonManager.addPigeon(Hendrick);


    }
}
