package com.example.pigeonnier.bll;

import com.example.pigeonnier.bo.Pigeon;

import java.util.List;

public interface PigeonManager {

    public void addPigeon(Pigeon pigeon);

    public List<Pigeon> getAllPigeons();

    Pigeon getPigeonByCode(String code);

    void deletePigeonByCode(String code);
}
