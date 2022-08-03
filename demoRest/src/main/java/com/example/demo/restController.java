package com.example.demo;

public class restController {
private String name;
private String lastname;
public String getName() {
	return name;
}
public restController(String name, String lastname) { // constructor
	super();
	this.name = name;
	this.lastname = lastname;
}
public void setName(String name) {    //setter method
	this.name = name;
}
public String getLastname() {   //getter method
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}


}
