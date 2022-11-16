package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.Todo;
@Repository
public interface AppDao extends CrudRepository<Todo, Integer>{

}
