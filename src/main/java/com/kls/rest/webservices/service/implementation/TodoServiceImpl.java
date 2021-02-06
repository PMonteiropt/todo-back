package com.kls.rest.webservices.service.implementation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kls.rest.webservices.entity.Todo;
import com.kls.rest.webservices.service.interfaces.ITodosService;



@Service
@Transactional
public class TodoServiceImpl implements ITodosService {
    
    List<Todo> list = new ArrayList<Todo>();
    
    boolean first = true;
    

    @Override
    public List<Todo> getAllTodosByUser(String username) {
	
	if(first) {
	    populateMockedTodos();
	    first = false;
	}
	
	return list;
    }
    
    
    private List<Todo> populateMockedTodos() {
	
	list.clear();
	list.add( new Todo( 1L, "Learn Java",  true,  new Date(), "KLS"));
	list.add( new Todo( 2L, "Learn Python",  false,  new Date(), "KLS"));
	list.add( new Todo( 3L, "Learn JavaScript",  true,  new Date(), "KLS"));
	
	
	return list;
    }
    
    public boolean deleteTodo(Long id) {
	
	
	list.removeIf(n-> n.getId().equals(id));
	System.out.println(list.size());
	if(list.size()==2) {
	    return true;
	} else {

	    return false;
	}
	
    }

}
