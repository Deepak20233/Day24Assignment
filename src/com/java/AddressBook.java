package com.java;
import java.util.*;
public class AddressBook {
	public HashSet<Contacts> addressBook = new HashSet<>();
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Contacts> myContacts = new ArrayList<Contacts>();
	public static void main(String[] args) {
		    System.out.println("-----------------Add new contact to address book----------------");
		    AddressBookDictionary addressBookDictionary = new AddressBookDictionary();
			addressBookDictionary.addMultipleAddressBook();
		    addressBookDictionary.printAddressBookDictionary();
	}

	private static void displayListOfContacts(ArrayList<Contacts> myContacts2) {
		System.out.println("------------------------------------------------------------------");
		for(int i=0; i< myContacts.size(); i++) {
 			System.out.println(myContacts.get(i));
		}
		System.out.println("------------------------------------------------------------------");
		
	}

	private static void deleteExistingContact() {
		int indx = -1;
		boolean conatctPresent= false;
		 System.out.println("Enter the contact First Name to Delete : ");
		 String firstNameToSearch = scanner.next();
		 for (Contacts contacts : myContacts) {
			 indx++;
			 String firstName = contacts.getFirstName();
			 if(firstNameToSearch.equals(firstName)) {
				 conatctPresent = true;
				 myContacts.remove(indx);
				 break;
				 }
			 }
		 if(conatctPresent== false){
			 System.out.println("There is no Contact in the Address Book for given Name :" + firstNameToSearch);
		 }
	} 

	private static void editExistingContact() {
		 int indx = -1;
		 System.out.println("Enter the contact First Name to Edit : ");
		 String firstNameToSearch = scanner.next();
		 for (Contacts contacts : myContacts) {
			 indx++;
			 String firstName = contacts.getFirstName();
			 if(firstNameToSearch.equals(firstName))
    		 {
				 
				 System.out.println("What do you wish to edit for: "+ firstNameToSearch +".\n Enter 1 for"
			                + " address \n Enter 2 for phone number \n Enter 3 for email ");
			        int choice = scanner.nextInt();
			        switch (choice) {
			            case 1:
			            	    System.out.println("Enter new city : ");
				                String city = scanner.next();
				                System.out.println("Enter new state : ");
				                String state = scanner.next();
				                System.out.println("Enter new zip : ");
				                String zip = scanner.next();
				                contacts.address = new Address(city, state, zip);
				                break;
			            case 2:
			            	    System.out.println("Enter new phone : ");
			            	    contacts.phone = scanner.nextLong();
				                break;
			            case 3:
			            	    System.out.println("Enter new email");
			            	    contacts.email = scanner.next();
				                break;
		               
			        }
					myContacts.set(indx, contacts);
    		 }
			 
		 }
		 if(indx== -1) {
			 	System.out.println("There is no Contact in the Address Book for given Name :" + firstNameToSearch);
		 }
	}

	public void addContact(int count) {
		        
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
				addressBook.add(new Contacts(firstName, lastName, email, city, state , zip, phone));			
	}
	
	public AddressBook addMultipleContacts(int totalAddressBok) {
        System.out.println("How many persons do you want to add to the address book " + totalAddressBok + "?");
        int numberOfContacts = scanner.nextInt();
        for (int i=0;i<numberOfContacts;i++)
            this.addContact(i);
        return this;
    }
	@Override
    public String toString() {
        return ": {" +
        		addressBook +
                '}';
    }
}