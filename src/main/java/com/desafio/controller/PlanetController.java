package com.desafio.controller;

import com.desafio.model.Planet;
import com.desafio.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PlanetController implements iCRUD<Planet>{
    @Autowired
    PlanetService planetService;

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Planet getById(Integer id) {
        return planetService.getById(id);
    }

    @Override
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Planet getByName(String name) {
        return planetService.getByName(name);
    }

    @Override
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Planet> getAll() {
        return planetService.getAll();
    }

    @Override@RequestMapping(value = "/", method = RequestMethod.POST)
    public void create(Planet entity) {
        planetService.create(entity);
    }

    @Override
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void delete(Integer id) {
        planetService.delete(id);
    }
}
