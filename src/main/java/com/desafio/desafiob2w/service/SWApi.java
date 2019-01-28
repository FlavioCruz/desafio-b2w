package com.desafio.desafiob2w.service;

import com.desafio.desafiob2w.model.Planet;

import java.util.List;

/**
 * Class to handle requests from the external API
 */

public interface SWApi {

    List<Planet> getAll();
    Planet getById(Integer id);
}
