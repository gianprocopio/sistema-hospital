package com.gianproco.models;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
	private int id;
	private String name;
	private String email;
	private String speciality;
	
					
	public Doctor(String name, String speciality) {
		super();
		this.name = name;
		this.speciality = speciality;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
	public void addAvailableAppointment(Date date, String time) {
		availableAppointments.add(new AvailableAppointment(date, time));
	}
	
	public ArrayList<AvailableAppointment> getAvailableAppointments(){
		return availableAppointments;
	}
	
	
	//Register an appointment
	public static class AvailableAppointment{
		private int id_availableAppointment;
		private Date date;
		private String time;
		
		public AvailableAppointment(Date date, String time) {
			super();
			this.date = date;
			this.time = time;
		}

		public int getId_availableAppointment() {
			return id_availableAppointment;
		}

		public void setId_availableAppointment(int id_availableAppointment) {
			this.id_availableAppointment = id_availableAppointment;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
		
		
		
	}
	
	

}
