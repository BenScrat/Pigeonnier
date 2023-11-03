package com.example.pigeonnier.bll;

import com.example.pigeonnier.bo.Pigeon;
import jakarta.transaction.Transactional;

import java.util.List;

public interface PigeonManager {

    public void addPigeon(Pigeon pigeon);

    public List<Pigeon> getAllPigeons();

    @Transactional
    void volePigeon(Pigeon pigeon);
}
