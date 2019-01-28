package com.desafio.desafiob2w.service;

import com.desafio.desafiob2w.model.Planet;
import com.desafio.desafiob2w.repository.IPlanetDataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetServiceImpl extends SpringBeanAutowiringSupport implements PlanetService {

    @Autowired
    private IPlanetDataAccess planetDataAccess;

    @Override
    public Planet getById(Integer id) {
        Optional<Planet> planet = planetDataAccess.findById(id);
        return planet.isPresent() ? planet.get() : null;
    }

    @Override
    public Planet getByName(String name) {
        return planetDataAccess.getByName(name);
    }

    @Override
    public List<Planet> getAll() {
        return planetDataAccess.findAll();
    }

    @Override
    public void create(Planet entity) {
        planetDataAccess.save(entity);
    }

    @Override
    public void delete(Integer id) {
        Optional<Planet> planet = planetDataAccess.findById(id);
        planetDataAccess.delete(planet.get());
    }
}
