package com.desafio.desafiob2w.service.impl;

import com.desafio.desafiob2w.model.Planet;
import com.desafio.desafiob2w.repository.IPlanetDataAccess;
import com.desafio.desafiob2w.service.PlanetService;
import com.desafio.desafiob2w.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetServiceImpl extends SpringBeanAutowiringSupport implements PlanetService {

    @Autowired
    private IPlanetDataAccess planetDataAccess;


    /**
     * List all occurrences of planet in the DataBase
     * @return {@link List<Planet>}
     */
    @Override
    public List<Planet> getAll() {
        return planetDataAccess.findAll();
    }


    /**
     * Recover planet by given ID
     * @param id {@link Integer}
     * @return {@link Planet}
     * @throws ResourceNotFoundException
     */
    @Override
    public Planet getById(Integer id) throws ResourceNotFoundException {
        Optional<Planet> planet = planetDataAccess.findById(id);
        if(planet.isPresent()){
            return planet.get();
        }else{
            throw new ResourceNotFoundException("Resource with given ID was not found.");
        }
    }


    /**
     * Recover planet by given name
     * @param name {@link String}
     * @return {@link Planet}
     * @throws ResourceNotFoundException
     */
    @Override
    public Planet getByName(String name) throws ResourceNotFoundException{
        Planet planet = planetDataAccess.getByName(name);
        if(planet == null){
            throw new ResourceNotFoundException("Resource with given name was not found.");
        }
        return planet;
    }

    /**
     * Creates a new planet dealing with incremental ID (as Mongo doesn't create sequential ID)
     * @param entity {@link Planet}
     */
    @Override
    public void create(Planet entity) {
        List<Planet> planets = getAll();
        if(planets.size() == 0){
            entity.setId(1);
        }else{
            Integer lastIndex = planets.size() - 1;
            entity.setId(planets.get(lastIndex).getId() + 1);
        }
        planetDataAccess.save(entity);
    }

    /**
     * Deletes a Planet by given ID
     * @param id {@link Integer}
     * @throws ResourceNotFoundException
     */
    @Override
    public void delete(Integer id) throws ResourceNotFoundException{
        Optional<Planet> planet = planetDataAccess.findById(id);
        if(!planet.isPresent())
            throw new ResourceNotFoundException("Resource with given ID was not found to be deleted.");
        planetDataAccess.delete(planet.get());
    }
}
