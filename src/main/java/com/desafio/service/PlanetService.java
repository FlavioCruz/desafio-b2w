package com.desafio.service;

import com.desafio.dataaccess.IPlanetDataAccess;
import com.desafio.model.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetService {

    @Autowired
    IPlanetDataAccess planetDataAccess;

    public Planet getById(Integer id) {
        return planetDataAccess.getById(id);
    }

    public Planet getByName(String name) {
        return planetDataAccess.getByName(name);
    }

    public List<Planet> getAll() {
        return planetDataAccess.findAll();
    }

    public void create(Planet entity) {
        planetDataAccess.save(entity);
    }

    public void delete(Integer id) {
        Planet planet = planetDataAccess.getById(id);
        planetDataAccess.delete(planet);
    }
}
