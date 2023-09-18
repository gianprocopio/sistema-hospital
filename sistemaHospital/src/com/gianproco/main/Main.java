package com.gianproco.main;

import static com.gianproco.ui.UIMenu.*;

import java.util.Date;

import com.gianproco.models.*;

public class Main {

	public static void main(String[] args) {
		//showMenu();
		
		Doctor myDoctor = new Doctor("Gian Proco", "Nuemonología");
		
		myDoctor.addAvailableAppointment(new Date(), "4pm");
		myDoctor.addAvailableAppointment(new Date(), "9pm");
		
		for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
			System.out.println(availableAppointment.getDate() + "\n" + availableAppointment.getTime()+ "\n------------------\n");
		}
		
	}

}
