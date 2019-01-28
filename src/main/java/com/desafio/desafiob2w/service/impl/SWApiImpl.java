package com.desafio.desafiob2w.service.impl;

import com.desafio.desafiob2w.model.Planet;
import com.desafio.desafiob2w.repository.IPlanetDataAccess;
import com.desafio.desafiob2w.service.SWApi;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SWApiImpl implements SWApi {

    private final String BASE_URL = "https://swapi.co/api/";
    @Autowired
    IPlanetDataAccess dataAccess;

    @Override
    public List<Planet> getAll() {
        RestTemplate template = new RestTemplate();
        List<Planet> p = template.getForObject(BASE_URL + "planets/", List.class);
        return p;
    }

    @Override
    public Planet getById(Integer id) {
        RestTemplate template = new RestTemplate();
        Planet p = template.getForObject(BASE_URL + "planets/" + id.toString(), Planet.class);
        return p;
    }

    @Override
    public void generateInitialInfo() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray a = (JSONArray) parser.parse(new FileReader("planetas.json"));
        for (Object o : a) {
            JSONObject planetJSON = (JSONObject) o;
            Planet planet = new Planet();
            planet.setName((String) planetJSON.get("name"));
            planet.setTerrain(new ArrayList<>());
            for(Object t : (JSONArray) planetJSON.get("terrain")){
                JSONObject terr = (JSONObject) t;
                planet.getTerrain().add(terr.toString());
            }


        }
    }
}
