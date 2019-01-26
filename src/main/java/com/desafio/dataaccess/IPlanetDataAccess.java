package com.desafio.dataaccess;

import com.desafio.model.Planet;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IPlanetDataAccess extends MongoRepository<Planet, Integer> {
    Planet getById(Integer id);
    Planet getByName(String name);
    void create(Planet entity);
    void delete(Planet entity);
}
