package com.desafio.desafiob2w.resource;

import com.desafio.desafiob2w.model.Planet;
import com.desafio.desafiob2w.resource.response.Response;
import com.desafio.desafiob2w.resource.response.Status;
import com.desafio.desafiob2w.service.PlanetService;
import com.desafio.desafiob2w.service.SWApi;
import com.desafio.desafiob2w.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/planets")
public class PlanetResource {
    @Autowired
    private PlanetService planetService;
    @Autowired
    private SWApi api;

    /**
     * Returns all planets
     * @return {@link List<Planet>}
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getAll() {
//        api.generateInitialInfo();
        List<Planet> planets = planetService.getAll();
        return new Response(planets, Status.SUCCESS.toString(), Status.SUCCESS);
    }

    /**
     * Returns a planet based on given id
     * @param id {@link Integer}
     * @return {@link Planet}
     */
    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getById(@PathVariable(value = "id") Integer id) {
        try{
            Planet planet = planetService.getById(id);
            return new Response(planet, Status.SUCCESS.toString(), Status.SUCCESS);
        }catch(ResourceNotFoundException e){
            return new Response(e.getMessage(), Status.NOT_FOUND.toString(), Status.NOT_FOUND);
        }
    }

    /**
     * Returns a planet based on given name
     * @param name {@link String}
     * @return {@link Planet}
     */
    @GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getByName(@PathVariable(value = "name") String name) {
        try{
            Planet planet = planetService.getByName(name);
            return new Response(planet, Status.SUCCESS.toString(), Status.SUCCESS);
        }catch(ResourceNotFoundException e){
            return new Response(e.getMessage(), Status.NOT_FOUND.toString(), Status.NOT_FOUND);
        }
    }

    /**
     * Returns the status of the transaction
     * @param entity
     */
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response create(@RequestBody Planet entity) {
        planetService.create(entity);
        return new Response(entity.getId(), Status.SUCCESS.toString(), Status.SUCCESS);
    }

    @PostMapping(value = "/mult", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response create(@RequestBody List<Planet> entities) {
        for(Planet p : entities){
            planetService.create(p);
        }
        return new Response(null, Status.SUCCESS.toString(), Status.SUCCESS);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        planetService.delete(id);
    }
}
