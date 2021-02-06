package com.kls.rest.webservices.entity;

import java.util.Date;

public class Todo {

    private Long id;
    private String description;
    private String username;
    private boolean done;
    private Date targetDate;

    public Todo() {
	super();

    }

    public Todo(Long id, String description, boolean done, Date targetDate,String username) {
	super();
	this.id = id;
	this.description = description;
	this.done = done;
	this.targetDate = targetDate;
	this.username = username;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public boolean isDone() {
	return done;
    }

    public void setDone(boolean done) {
	this.done = done;
    }

    public Date getTargetDate() {
	return targetDate;
    }

    public void setTargetDate(Date targetDate) {
	this.targetDate = targetDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    

}
