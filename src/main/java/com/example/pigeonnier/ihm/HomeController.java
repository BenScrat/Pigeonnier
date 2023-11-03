package com.example.pigeonnier.ihm;

import com.example.pigeonnier.bll.PigeonManager;
import com.example.pigeonnier.bo.Pigeon;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    PigeonManager pigeonManager;

    @GetMapping("/home")
    public String home(Model model){
        List<Pigeon> pigeons = pigeonManager.getAllPigeons();
        model.addAttribute("pigeons",pigeons);
        return "home";
    }

    @RequestMapping("/vole")
    @Transactional
    public void vole(String pigeonnier, String code){
        String url = "http://" + pigeonnier + "/pigeon/" + code;
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForEntity(url, Pigeon.class);

        pigeonManager.addPigeon(new Pigeon());
    }
}
