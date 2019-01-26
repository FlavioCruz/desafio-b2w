package com.desafio.resource;

import com.desafio.model.Planet;
import com.desafio.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planets")
public class PlanetResource {
    @Autowired
    PlanetService planetService;

    @GetMapping(value = "/")
    public List<Planet> getAll() {
        return planetService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Planet getById(Integer id) {
        return planetService.getById(id);
    }

    @GetMapping(value = "/{name}")
    public Planet getByName(String name) {
        return planetService.getByName(name);
    }

    @PostMapping(value = "/")
    public void create(Planet entity) {
        planetService.create(entity);
    }

    @DeleteMapping(value = "/")
    public void delete(Integer id) {
        planetService.delete(id);
    }
}
