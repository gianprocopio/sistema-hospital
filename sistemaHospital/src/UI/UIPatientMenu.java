package UI;

import models.Doctor;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;

public class UIPatientMenu {
	public static void showPatientMenu() {
		
	int response = 0;
	do {
		System.out.println("\n--------------------------");
		System.out.println("::Patient::");
		System.out.println("Welcome " + UIMenu.patientLogged.getName());
		System.out.println("1. Book an appointment");
		System.out.println("2. My appointments");
		System.out.println("0. Log out");
		System.out.println("\n--------------------------");
		System.out.print("Choose an option: ");
		
		Scanner sc = new Scanner(System.in);
		response = Integer.valueOf(sc.nextLine());
		
		switch(response) {
			case 1:
				response = 0;
				showBookAppointmentMenu();
				break;
			case 2: 
				response = 0;
				showPatientAppointments();
				break;
			case 0:
				UIMenu.showMenu();;
				break;
			default:
				System.out.println("Please select a correct option");
		}
		
	}while(response !=0);

}
	private static void showBookAppointmentMenu() {
		int response = 0;
		do {
			System.out.println(":: Book and appointment ::");
			System.out.println(":: Select a date ::");
			// Numeración de la lista de fechas
			//Indice de la fecha seleccionada
			/*
			 * 1. - doctor1
			 * 		- 1. fecha 1
			 * 		- 2. fecha 2
			 * 2. - doctor2
			 * */
			
			Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
			
			int k = 0;
			
			for(int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
				ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
				
				
				Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
				
				for(int j = 0; j < availableAppointments.size(); j++) {
					k++;
					System.out.println(k + ". " + availableAppointments.get(j).getDate());
					doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
					doctors.put(Integer.valueOf(k), doctorAppointments);
				}
			}
			Scanner sc = new Scanner(System.in);
			int responseDateSelected = Integer.valueOf(sc.nextLine());
			
			Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
			Integer indexDate = 0;
			Doctor doctorSelected = new Doctor("", "", "");
			
			for(Map.Entry<Integer, Doctor> doctor : doctorAvailableSelected.entrySet()) {
				indexDate = doctor.getKey();
				doctorSelected = doctor.getValue();
			}
			
			System.out.println(doctorSelected.getName() + 
					" | Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() + 
					" | TIme: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
			
			System.out.println("Confirm your appontment: \n1. Yes \n2. Change Date");
			
			response = Integer.valueOf(sc.nextLine());
			
			if(response == 1) {
				UIMenu.patientLogged.addAppointmentDoctors(
						doctorSelected, 
						doctorSelected.getAvailableAppointments().get(indexDate).getDate(null), 
						doctorSelected.getAvailableAppointments().get(indexDate).getTime()
						);
				showPatientMenu();
			}
			
			
			
		}while(response != 0);
	}
	
	private static void showPatientAppointments() {
		int response = 0;
		do {
			System.out.println("::My Appointments::");
			if(UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
				System.out.println("You don't have appointments");
				break;
			}
			
			for(int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
				int j = i + 1;
				System.out.println(j + ". " + "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() + 
						" | Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
						"\nDoctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
			}
			
			System.out.println("0. Return\n\n");		
				
		}while(response != 0);
	}
}
