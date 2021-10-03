package com.pedelriomarron.ejercicio1.dao.idao;

import java.util.List;

public interface Dao<T,K> {

    T get(K k);
    int create(T t);
    T update(T t);
    int delete(K k);
    List<T> getAll();


}
