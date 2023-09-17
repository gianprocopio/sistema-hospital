package com.gianproco.models;

public class Doctor {
	private int id;
	private String name;
	private String speciality;
			
	public Doctor(String name, String speciality) {
		super();
		this.name = name;
		this.speciality = speciality;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getId() {
		return id;
	}
	

}
