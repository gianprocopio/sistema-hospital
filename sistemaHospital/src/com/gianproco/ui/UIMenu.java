package com.gianproco.ui;

import java.util.Scanner;

public class UIMenu {
	
	public static String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
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
					showDoctorMenu();
					break;
				case 2:
					response = 0;
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
		
	public static void showDoctorMenu() {
			int response = 0;
			
			do {
				System.out.println("\n--------------------------");
				System.out.println("::Doctor::");
				System.out.println("1. My patients");
				System.out.println("2. My shifts");
				System.out.println("0. Return");
				System.out.println("--------------------------");
				
				Scanner sc = new Scanner(System.in);
				response = Integer.valueOf(sc.nextLine());
							
				switch(response) {
					case 1: 
						response = 0;
						showDoctorPatientsMenu();
						break;
					case 2:
						response = 0;
						showDoctorShiftsMenu();
						break;
					case 3:
						response = 0;
						showMenu();
						break;
					default:
						System.out.println("Please select a correct option.");
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

