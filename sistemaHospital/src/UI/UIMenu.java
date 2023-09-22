package UI;

import java.util.ArrayList;
import java.util.Scanner;

import models.Doctor;
import models.Patient;

public class UIMenu {
	
	public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	public static Doctor doctorLogged;
	public static Patient patientLogged;
	
	
	public static void showMenu() {
		System.out.println(":::Welcome to the Hospital System:::\n");
	
		int response = 0;
		do {
			System.out.println("\n--------------------------");
			System.out.println("1. Doctor");
			System.out.println("2. Patient");
			System.out.println("0. Exit");
			System.out.println("--------------------------");
			System.out.print("Choose an option: ");	
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());
			
			
			switch(response) {
				case 1:
					response = 0;
					authUser(1);
					UIDoctorMenu.showDoctorMenu();
					break;
				case 2:
					response = 0;
					authUser(2);
					showPatientMenu();
					break;
				case 0:
					System.out.println("Thank you for coming!");
					break;
				default:
					System.out.println("Please select a correct option.");
			}
			
		}while(response != 0);
		
	}
	
	private static authUser(int userType) {
		// userType == 1 --> Doctor
		// userType == 2 --> Patient
		
		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor("Alejandro Martínez", "Pediatrics", "alejandro@gmail.com"));
		doctors.add(new Doctor("Marcelo Rodríguez", "Pulmonology", "marcerodri@gmail.com"));
		doctors.add(new Doctor("Jhon Doe", "Cardiology", "jhondoe@gmail.com"));
	
		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(new Patient("Gianluca Procopio", "gianproco@gmail.com"));
		patients.add(new Patient("Carlos Sánchez", "carlosanchez@gmail.com"));
		patients.add(new Patient("Jhon Mc Donald", "jhonmcdonald@gmail.com"));
	
		boolean emailCorrect = false;
		do {
			System.out.print("Insert your email: [example@gmail.com]");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			
			if(userType == 1) {
				for(Doctor doctor: doctors) {
					if(doctor.getEmail().equals(email)) {
						emailCorrect = true;
						//Get user logged:
						doctorLogged = doctor;
						//Show doctor menu
						UIDoctorMenu.showDoctorMenu();
					}
				}
			}
			else if(userType == 2) {
				for(Patient patient: patients) {
					if(patient.getEmail().equals(email)) {
						emailCorrect = true;
						patientLogged = patient;
						showPatientMenu();
					}
				}
			}
			
		}while(!emailCorrect);
	
	}
	
	
	
	public static void showPatientMenu() {
			int response = 0;
			do {
				System.out.println("\n--------------------------");
				System.out.println("::Patient::");
				System.out.println("1. Book an appointment");
				System.out.println("2. My appointments");
				System.out.println("0. Return");
				System.out.println("\n--------------------------");
				System.out.print("Choose an option: ");
				Scanner sc = new Scanner(System.in);
				response = Integer.valueOf(sc.nextLine());
				
				switch(response) {
					case 1:
						response = 0;
						bookAppointment();
						break;
					case 2: 
						response = 0;
						System.out.println("::My appointments::");
						break;
					case 0:
						showMenu();
						break;
					default:
						System.out.println("Please select a correct option");
				}
				
			}while(response !=0);
		}
		
	
	static void showDoctorShiftsMenu() {
		System.out.println("::My Shifts::");
	}
		
	static void showDoctorPatientsMenu() {
		System.out.println("::My Patients");
	}
	
	static void bookAppointment() {
		System.out.println("::Book an appointment::");
		int response = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < MONTHS.length; i++) {
			System.out.println((i+ 1)+ "." + MONTHS[i]);
		}
		System.out.print("\nChoose a month: ");
		response = Integer.valueOf(sc.nextLine());
	}
		
		
		
		
	}

