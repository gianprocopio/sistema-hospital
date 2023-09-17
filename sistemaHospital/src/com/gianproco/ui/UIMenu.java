package com.gianproco.ui;

import java.util.Scanner;

public class UIMenu {
	public static void showMenu() {
		System.out.println(":::Welcome to the Hospital System:::\n");
		System.out.println("Choose the option desired");
	
		int response = 0;
		do {
			System.out.println("1. Doctor");
			System.out.println("2. Patient");
			System.out.println("0. Exit");
			
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
				System.out.println("1. Book and appointment");
				System.out.println("2. My appointments");
				System.out.println("0. Return");
				System.out.println("\n--------------------------");
				
				Scanner sc = new Scanner(System.in);
				response = Integer.valueOf(sc.nextLine());
				
				switch(response) {
					case 1:
						response = 0;
						System.out.println("::Book an appointment::");
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
				System.out.println("\n--------------------------");
				
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
			System.out.println("::My Patients::");
		}
		
		
		
		
		
	}

