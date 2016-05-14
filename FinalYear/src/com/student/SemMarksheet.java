package com.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="semmarksheet")
public class SemMarksheet {
	private String name,date,location,sem;

	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}
	

	private String userid;
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public SemMarksheet(String name, String date, String location,String sem,String userid) {
		super();
		this.name = name;
		this.date = date;
		this.location = location;
		this.sem = sem;
		this.userid = userid;
	}

	public SemMarksheet() {
		super();
	}
	

}
