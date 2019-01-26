package com.desafio.controller;


import java.util.List;

public interface iCRUD<T> {

    T getById(Integer id);

    T getByName(String name);

    List<T> getAll();

    void create(T entity);

    void delete(Integer id);
}
