package com.java;
import java.util.ArrayList;
import java.util.Scanner;

public class AddContacts {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Contacts> myContacts = new ArrayList<Contacts>();
	public static void main(String[] args) {
		System.out.println("-----------------Add new contact to address book----------------");
		addNewContact();

	}
	private static void addNewContact() {

		int option;
		
		do {
			System.out.println("1 - Add new contact. Enter 1 to continue , else enter 2 !!!");
			option = scanner.nextInt(); 
			switch (option) {
			case 1:
				System.out.println("Enter First Name : ");
				String firstName = scanner.next();
				System.out.println("Enter Last Name : ");
				String lastName = scanner.next();
				System.out.println("Enter Email : ");
				String email = scanner.next();
				System.out.println("Enter City: ");
				String city = scanner.next();
				System.out.println("Enter State: ");
				String state = scanner.next();
				System.out.println("Enter ZIP : ");
				String zip = scanner.next();
				System.out.println("Enter Phone : ");
				long phone = scanner.nextLong();
				myContacts.add(new Contacts(firstName, lastName, email, city, state , zip, phone));
				
				break;

			case 2:
				//scanner.close();
				return;
			}
			
		}while(option!=0);
	}
}