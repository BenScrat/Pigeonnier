package com.example.pigeonnier.ws;

import com.example.pigeonnier.bll.PigeonManager;
import com.example.pigeonnier.bo.Pigeon;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PigeonWS {

    @Autowired
    PigeonManager pigeonManager;



    @GetMapping("/pigeon/attaque/{code}")
    @Transactional
    public Pigeon attaquePigeon(@PathVariable("code") String code){
        //je souhaite vérifier si le code renseigné correspond à un pigeon de la base de données
        if(pigeonManager.getPigeonByCode(code) == null){
            return null;
        }
        Pigeon pigeon = pigeonManager.getPigeonByCode(code);
        pigeonManager.deletePigeonByCode(code);
        //je souhaite returné l'obejt pigeon du code renseigne
        return pigeon;
    }

}
