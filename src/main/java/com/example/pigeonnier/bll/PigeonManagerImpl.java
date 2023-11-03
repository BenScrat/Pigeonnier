package com.example.pigeonnier.bll;

import com.example.pigeonnier.bo.Pigeon;
import com.example.pigeonnier.dal.PigeonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PigeonManagerImpl implements PigeonManager {
    @Autowired
    PigeonDAO pigeonDAO;

    @Override
    public void addPigeon(Pigeon pigeon) {
        pigeonDAO.save(pigeon);
    }

    @Override
    public List<Pigeon> getAllPigeons() {
        return (List<Pigeon>) pigeonDAO.findAll();
    }

    @Override
    public Pigeon getPigeonByCode(String code) {
        return  pigeonDAO.findByCode(code);
    }


    @Override
    public void deletePigeonByCode(String code) {
        pigeonDAO.deleteByCode(code);
    }

    }

