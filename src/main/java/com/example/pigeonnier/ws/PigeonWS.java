package com.example.pigeonnier.ws;

import com.example.pigeonnier.bll.PigeonManager;
import com.example.pigeonnier.bo.Pigeon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws/pigeon")
public class PigeonWS {

    @Autowired
    PigeonManager pigeonManager;

    @RequestMapping("/volePigeon/{code}/{pigeonnier}")
    public String volePigeon(Pigeon pigeon) {
        System.out.println("Vous avez volé le pigeon nommé "+ pigeon.getNom() + " qui est propriétaire de " + pigeon.getProprio());
        pigeonManager.volePigeon(new Pigeon());
        return "Pigeon volé a "+ pigeon.getProprio();
    }
}
