package com.sample.MySampleProject;

import lombok.Getter;
import lombok.Setter;

public class SimpleDestination {
    private String name;
    private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}