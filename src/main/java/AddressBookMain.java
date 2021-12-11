import java.util.*;
import java.util.Scanner;

import entity.Address;
import entity.Person;
import interfaces.IContactDetails;
import services.ContactDetailsImpl;

//main method
public class AddressBookMain {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to AddressBook Management System");

		IContactDetails contactDetails = new ContactDetailsImpl();

		System.out.println("Contact Creation Method Calling");
		contactDetails.createContact();

		System.out.println("Contact Adding Method Calling");
		contactDetails.addContact();

		System.out.println("Contact Updation Method Calling");
		contactDetails.updatePerson();
		
		System.out.println("Contact Deletion Method Calling");
		contactDetails.deleteByName();
		

	}
}
