package com.buffer.mqpatterns.p114.global;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;


@JsonIgnoreProperties(ignoreUnknown = true)
public class OurData implements Serializable {
    private static Random r = new Random();

    private String id = UUID.randomUUID().toString();

    @JsonAlias("Greeting")
    private String greeting = "";

    private int value = r.nextInt(100);
    private Date date = new Date();
    private Date received = null;
    private String correlation = null;
    private String requestedReplyDest = null;

    public OurData(String greeting) {
        this.greeting = greeting;
    }

	public static Random getR() {
		return r;
	}

	public static void setR(Random r) {
		OurData.r = r;
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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getReceived() {
		return received;
	}

	public void setReceived(Date received) {
		this.received = received;
	}

	public String getCorrelation() {
		return correlation;
	}

	public void setCorrelation(String correlation) {
		this.correlation = correlation;
	}

	public String getRequestedReplyDest() {
		return requestedReplyDest;
	}

	public void setRequestedReplyDest(String requestedReplyDest) {
		this.requestedReplyDest = requestedReplyDest;
	}

	@Override
	public int hashCode() {
		return Objects.hash(correlation, date, greeting, id, received, requestedReplyDest, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OurData other = (OurData) obj;
		return Objects.equals(correlation, other.correlation) && Objects.equals(date, other.date)
				&& Objects.equals(greeting, other.greeting) && Objects.equals(id, other.id)
				&& Objects.equals(received, other.received)
				&& Objects.equals(requestedReplyDest, other.requestedReplyDest) && value == other.value;
	}

	@Override
	public String toString() {
		return "OurData [id=" + id + ", greeting=" + greeting + ", value=" + value + ", date=" + date + ", received="
				+ received + ", correlation=" + correlation + ", requestedReplyDest=" + requestedReplyDest + "]";
	}

	public OurData(String id, String greeting, int value, Date date, Date received, String correlation,
			String requestedReplyDest) {
		super();
		this.id = id;
		this.greeting = greeting;
		this.value = value;
		this.date = date;
		this.received = received;
		this.correlation = correlation;
		this.requestedReplyDest = requestedReplyDest;
	}

	public OurData() {
		super();
	}
	
}