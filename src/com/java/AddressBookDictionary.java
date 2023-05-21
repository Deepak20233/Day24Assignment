package com.java;
import java.util.*;
public class AddressBookDictionary {
	 HashMap<String, AddressBook> dictionaryOfAddressBooks = new HashMap<>();
	 static int count=0;
	 
	  public void addMultipleAddressBook() {
          System.out.println("How many AddressBooks do you want to create? ");
          int numberOfAddressBooks = AddressBook.scanner.nextInt();
          for (int i = 0; i < numberOfAddressBooks; i++) {
              count++;
              dictionaryOfAddressBooks.put("AddressBook-" + count, new AddressBook().addMultipleContacts(i));
          }
      }
	
      public void printAddressBookDictionary(){
          for(Map.Entry<String, AddressBook> e: dictionaryOfAddressBooks.entrySet()){
              System.out.println(e.getKey()+" " + e.getValue());
          }
      }
}
