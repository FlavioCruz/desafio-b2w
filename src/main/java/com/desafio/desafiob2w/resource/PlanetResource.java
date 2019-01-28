package com.desafio.desafiob2w.resource;

import com.desafio.desafiob2w.model.Planet;
import com.desafio.desafiob2w.service.PlanetService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.util.List;


@RestController
@RequestMapping("/planets")
public class PlanetResource {
    @Autowired
    private PlanetService planetService;
    //private IPlanetDataAccess planetDataAccess;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Planet> getAll() {
        Planet p = new Planet();
        p.setName("jndknswd");
        p.setClimate("dfsddd");
        p.setTerrain("sdsd");
        p.setId(1);
        create(p);
        return planetService.getAll();
    }

    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Planet getById(@PathVariable(value = "id") Integer id) {
        return planetService.getById(id);
    }

    @GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Planet getByName(@PathVariable(value = "nome") String name) {
        return planetService.getByName(name);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Planet entity) {
        planetService.create(entity);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        planetService.delete(id);
    }

    @GetMapping(value="/swapi/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getPlanetById(@PathVariable(value = "id") Integer id){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://swapi.co/api/planets/" + id.toString());
        JSONArray response = target.request(MediaType.APPLICATION_JSON_VALUE).get(JSONArray.class);
        return response;
    }
}
