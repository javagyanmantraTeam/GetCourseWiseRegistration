package com.course.dto;

// @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
public class ParticipantList {
public String id,name,eventName;



public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public ParticipantList(String id, String name, String eventName) {
	
	this.id = id;
	this.name = name;
	this.eventName = eventName;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEventName() {
	return eventName;
}

public void setEventName(String eventName) {
	this.eventName = eventName;
}
}
