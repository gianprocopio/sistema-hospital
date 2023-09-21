package main;

import static UI.UIMenu.*;

import java.util.Date;

import models.*;

public class Main {

	public static void main(String[] args) {
		//showMenu();
		
		Doctor myDoctor = new Doctor("Gian Proco", "Nuemonología", "gianproco@mail.com");
		
		myDoctor.addAvailableAppointment(new Date(), "4pm");
		myDoctor.addAvailableAppointment(new Date(), "9pm");
				
		System.out.println(myDoctor);
		
		User user = new Doctor("Gianluca Procopio", "Pediatrics", "gianproco@mail.com");
		user.showDataUser();
		
		User userPatient = new Patient("Carlos perluski", "carlito@mail.com");
		userPatient.showDataUser();
		
		User user1 = new User("Gianluca", "gianproco@mail.com") {

			@Override
			public void showDataUser() {
				System.out.println("Doctor");
				System.out.println("Hospital: Cruz Verde");
				System.out.println("Department: Pediatrics");
				
			}
		};
		user1.showDataUser();
		
		ISchedulable iSchedulable = new ISchedulable() {
			
			@Override
			public void schedule(Date date, String time) {
				
			}
		};
		
		
	}

}
