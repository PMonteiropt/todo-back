package com.kls.rest.webservices.service.interfaces;

import java.util.List;

import com.kls.rest.webservices.entity.Todo;

public interface ITodosService {
    
    
    List<Todo> getAllTodosByUser(String username);
    public boolean deleteTodo(Long id);

}
