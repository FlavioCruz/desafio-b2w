package com.desafio.controller;

import com.desafio.model.Planet;
import com.desafio.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PlanetController implements iCRUD<Planet>{
    @Autowired
    PlanetService planetService;

    @Override
    public Planet getById(Integer id) {
        return planetService.getById(id);
    }

    @Override
    public Planet getByName(String name) {
        return planetService.getByName(name);
    }

    @Override
    public List<Planet> getAll() {
        return planetService.getAll();
    }

    @Override
    public void create(Planet entity) {
        planetService.create(entity);
    }

    @Override
    public void delete(Integer id) {
        planetService.delete(id);
    }
}
