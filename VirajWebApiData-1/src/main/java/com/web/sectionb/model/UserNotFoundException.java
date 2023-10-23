package com.web.sectionb.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{
private String errorMessage;


public UserNotFoundException() {
	super();
	errorMessage = "User Not Found For the Given Request";
}

public UserNotFoundException(String errorMessage) {
	super(errorMessage);
	this.errorMessage = errorMessage;
}

}
