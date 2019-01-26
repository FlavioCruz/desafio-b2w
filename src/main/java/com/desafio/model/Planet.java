package com.desafio.model;

import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "Planet")
public class Planet {
    private String name;
    private String climate;
    private String terrain;
    private Integer movieAppearances;
}
