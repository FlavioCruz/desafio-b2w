package com.desafio.desafiob2w.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "planets")
public class Planet {
    @Id
    private int id;
    private String name;
    private String climate;
    private String terrain;
    private Integer movieAppearances;

    public Planet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Integer getMovieAppearances() {
        return movieAppearances;
    }

    public void setMovieAppearances(Integer movieAppearances) {
        this.movieAppearances = movieAppearances;
    }
}
