package com.kls.rest.webservices.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kls.rest.webservices.entity.Todo;
import com.kls.rest.webservices.service.interfaces.ITodosService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {

    @Autowired
    private transient ITodosService todosService;

    @RequestMapping(value = "/all-todos", method = RequestMethod.GET)
    public List<Todo> getAllTodos(String username) {

	List<Todo> todosList = todosService.getAllTodosByUser(username);

	return todosService.getAllTodosByUser(username);
    }

    @RequestMapping(value = "/delete-todo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {

	boolean bol = todosService.deleteTodo(id);

	if (bol = true) {
	    return ResponseEntity.noContent().build();
	} else {
	    return ResponseEntity.notFound().build();
	}

    }

}
