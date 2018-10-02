package com.tleu.cms.domain.repositories;


import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<T> {

    private final List<T> elements = new ArrayList<>();

    public void delete(T element){
        elements.removeIf(elements -> elements.equals(element));
    }

    public List<T> findAll(){
        return this.elements;
    }

    public T save(T entity){
        this.elements.add(entity);
        return entity;
    }

    public T findOne(String id){
        return this.elements.stream().filter(el -> el.equals(id)).findFirst().get();
    }

}
