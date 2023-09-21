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
		
	}

}
