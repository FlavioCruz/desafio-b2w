package com.desafio.desafiob2w.service;

import com.desafio.desafiob2w.model.Planet;
import com.desafio.desafiob2w.service.exception.ResourceNotFoundException;

import java.util.List;

public interface PlanetService {

    /**
     * List all occurrences of planet in the DataBase
     * @return {@link List<Planet>}
     */
    List<Planet> getAll();

    /**
     * Recover planet by given ID
     * @param id {@link Integer}
     * @return {@link Planet}
     * @throws ResourceNotFoundException
     */
    Planet getById(Integer id) throws ResourceNotFoundException;

    /**
     * Recover planet by given name
     * @param name {@link String}
     * @return {@link Planet}
     * @throws ResourceNotFoundException
     */
    Planet getByName(String name) throws ResourceNotFoundException;

    /**
     * Creates a new Planet entity
     * @param entity {@link Planet}
     */
    void create(Planet entity);

    /**
     * Deletes a Planet by given ID
     * @param id {@link Integer}
     * @throws ResourceNotFoundException
     */
    void delete(Integer id) throws ResourceNotFoundException;
}
