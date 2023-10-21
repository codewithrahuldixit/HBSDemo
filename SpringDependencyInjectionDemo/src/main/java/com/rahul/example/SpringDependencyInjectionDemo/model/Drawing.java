package com.rahul.example.SpringDependencyInjectionDemo.model;

import org.springframework.context.annotation.Lazy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Named;

@Named
@Lazy
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Drawing {



private Shape shape;
//Constructor Invokes Automatically when Object is Created 
public Drawing( Shape shape) {
	super();
	//System.out.println("Injection is done using Costructor");
	this.shape = shape;
	System.out.println("Drawing Object is created");
}

public Shape getShape() {
	return shape;
}
//Setter Injection
//@Autowired
public void setShape(Shape shape) {
	System.out.println("Injection Done Usind Setter");
	this.shape = shape;
}

public void draw() {
	System.out.println(shape);
}
@PostConstruct
public void Initialization() {
	System.out.println("Initialization Done");
}

@PreDestroy
public void CleanUp() {
	System.out.println("CleanUp Done");
}

@Override
public String toString() {
	return "Drawing [shape=" + shape + "]";
}

}
