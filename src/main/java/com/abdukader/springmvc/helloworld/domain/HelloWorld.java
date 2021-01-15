package com.abdukader.springmvc.helloworld.domain;

import java.time.LocalDate;

public class HelloWorld {

	private String message;
	private LocalDate date;

	public HelloWorld() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
