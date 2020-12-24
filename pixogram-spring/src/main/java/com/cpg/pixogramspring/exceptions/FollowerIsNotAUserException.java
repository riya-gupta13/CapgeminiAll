package com.cpg.pixogramspring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class FollowerIsNotAUserException extends Exception {
	
	public FollowerIsNotAUserException(String message) {
		super(message);
	}

}
