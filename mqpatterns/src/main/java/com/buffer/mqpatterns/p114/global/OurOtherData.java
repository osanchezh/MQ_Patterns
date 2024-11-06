package com.buffer.mqpatterns.p114.global;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


@JsonIgnoreProperties(ignoreUnknown = true)
public class OurOtherData implements Serializable {

    private String id = UUID.randomUUID().toString();
    private String greeting = "";

    public OurOtherData(String greeting) {
        this.greeting = greeting;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public int hashCode() {
		return Objects.hash(greeting, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OurOtherData other = (OurOtherData) obj;
		return Objects.equals(greeting, other.greeting) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "OurOtherData [id=" + id + ", greeting=" + greeting + "]";
	}

	public OurOtherData(String id, String greeting) {
		super();
		this.id = id;
		this.greeting = greeting;
	}

	public OurOtherData() {
		super();
	}
	
}