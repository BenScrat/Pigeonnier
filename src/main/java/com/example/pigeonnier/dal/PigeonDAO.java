package com.example.pigeonnier.dal;

import com.example.pigeonnier.bo.Pigeon;
import org.springframework.data.repository.CrudRepository;

public interface PigeonDAO extends CrudRepository<Pigeon, Integer> {
}
