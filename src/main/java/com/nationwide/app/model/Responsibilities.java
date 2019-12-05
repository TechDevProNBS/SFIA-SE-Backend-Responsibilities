package com.nationwide.app.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;



@Document(collection = "sortanice")

public class Responsibilities {
	
	private String responsibility_name;
	private List<Responsibility_Descriptions> responsibility_descriptions;
	
	//Setter and Getter methods
	public String getResponsibility_name() {
		return responsibility_name;
	}
	public void setResponsibility_name(String responsibility_name) {
		this.responsibility_name = responsibility_name;
	}
	public List<Responsibility_Descriptions> getResponsibility_descriptions() {
		return responsibility_descriptions;
	}
	public void setResponsibility_descriptions(List<Responsibility_Descriptions> responsibility_descriptions) {
		this.responsibility_descriptions = responsibility_descriptions;
	}
	
	
}



