package com.desafio.desafiob2w.repository;

import com.desafio.desafiob2w.model.Planet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPlanetDataAccess extends MongoRepository<Planet, Integer> {
    Planet getByName(String name);
}
