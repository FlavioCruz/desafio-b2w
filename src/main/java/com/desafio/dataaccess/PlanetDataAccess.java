package com.desafio.dataaccess;

import com.desafio.model.Planet;

public class PlanetDataAccess {

    public Planet getById(Integer id){
        ConnectionManager.getInstance();
        return new Planet();
    }
}
