package com.desafio.desafiob2w.service;

import com.desafio.desafiob2w.model.Planet;

import java.util.List;

public interface PlanetService {

    List<Planet> getAll();

    Planet getById(Integer id);

    Planet getByName(String name);

    void create(Planet entity);

    void delete(Integer id);
}
