package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
	
	private String speciality;
	
					
	public Doctor(String name, String speciality, String email) {
		super(name, email);
		this.speciality = speciality;
	}
	

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
	public void addAvailableAppointment(String date, String time) {
		availableAppointments.add(new AvailableAppointment(date, time));
	}
	
	public ArrayList<AvailableAppointment> getAvailableAppointments(){
		return availableAppointments;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSpeciality: " + getSpeciality()
				+ "\n\n::Available Appointments::\n" + availableAppointments.toString();
	}
	
	@Override
	public void showDataUser() {
		System.out.println("Hospital: Hospital Italiano");
		System.out.println("Department: " + this.speciality);
	}
	
	
	//Register an appointment
	public static class AvailableAppointment{
		
		private int id_availableAppointment;
		private Date date;
		private String time;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		
		public AvailableAppointment(String date, String time) {
			try {
				this.date = format.parse(date);
			}catch(ParseException e) {
				e.printStackTrace();
			}
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
		
		public String getDate(String DATE) {
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
		
		@Override
		public String toString() {
			return "Date: " + getDate() + "| Time: " + getTime() + "\n";
		}
		
		
	}

	
	

}
