package com.example.pigeonnier.ihm;

import com.example.pigeonnier.bll.PigeonManager;
import com.example.pigeonnier.bo.Pigeon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
