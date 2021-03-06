package com.desafio.desafiob2w.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "planets")
public class Planet {
    @Id
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("climate")
    private List<String> climate;
    @JsonProperty("terrain")
    private List<String> terrain;
    @JsonProperty("films")
    private List<String> movies;
    private Integer movieAppearances;

    public Planet() {
        movieAppearances = 0;
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

    public List<String> getClimate() {
        return climate;
    }

    public void setClimate(List<String> climate) {
        this.climate = climate;
    }

    public List<String> getTerrain() {
        return terrain;
    }

    public void setTerrain(List<String> terrain) {
        this.terrain = terrain;
    }

    public Integer getMovieAppearances() {
        return movieAppearances;
    }

    public void setMovieAppearances(Integer movieAppearances) {
        this.movieAppearances = movieAppearances;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
        this.movieAppearances = this.movies != null ? this.movies.size() : 0;
    }
}
