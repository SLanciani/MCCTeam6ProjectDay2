package com.team6.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
public class Event {
	
	@Id
	long id;
	
	String code;
	String title;
	String description;
	
	public Event() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Event(long id, String code, String title, String description) {
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		this.description = description;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
