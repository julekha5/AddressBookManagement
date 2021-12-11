package services;

import java.util.*;
import entity.Person;
import entity.Address;
import interfaces.IContactDetails;

public class ContactDetailsImpl implements IContactDetails {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Person> list = new ArrayList<Person>();
	Person person = new Person();
	Address address = new Address();

	// create contact
	public void createContact() {
		Person person = new Person();
		Address address = new Address();

		System.out.println("Enter first Name");
		String firstName = scanner.next();

		System.out.println("Enter last Name");
		String lastName = scanner.next();

		System.out.println("Enter Email");
		String email = scanner.next();

		System.out.println("Enter phone number");
		String phoneNumber = scanner.next();

		System.out.println("Enter state");
		String state = scanner.next();

		System.out.println("Enter city");
		String city = scanner.next();

		System.out.println("Enter zip");
		long zip = scanner.nextInt();

		System.out.println("Contact Created");
		person.setAddress(address);
		list.add(person);

		System.out.println("New Details are:");
		System.out.println("FirstName:" + firstName + " " + "LastName:" + lastName + " " + "Email:" + email + " "
				+ "PhoneNumber:" + phoneNumber + " " + "State:" + state + " " + "City:" + city + "  " + "Zip" + zip);
	}

	// Update contact
	public void addContact() {
		Person person = new Person();
		Address address = new Address();
		System.out.println("Enter Person Details:");

		System.out.println("Enter first Name");
		String firstName = scanner.next();
		person.setFirstName(firstName);

		System.out.println("Enter last Name");
		String lastName = scanner.next();
		person.setLastName(lastName);

		System.out.println("Enter Email");
		String email = scanner.next();
		person.setEmail(email);

		System.out.println("Enter phone number");
		String phoneNumber = scanner.next();
		person.setPhoneNumber(phoneNumber);

		System.out.println("Enter state");
		String state = scanner.next();
		address.setState(state);

		System.out.println("Enter city");
		String city = scanner.next();
		address.setCity(city);

		System.out.println("Enter zip");
		long zip = scanner.nextInt();
		address.setZip(zip);

		System.out.println("Contact added details are:");
		person.setAddress(address);
		list.add(person);

		System.out.println("New added contact Details are:");
		System.out.println("FirstName:" + person.getFirstName() + " " + "LastName:" + person.getLastName() + " "
				+ "Email:" + person.getEmail() + " " + "PhoneNumber:" + person.getPhoneNumber() + " " + "Address:"
				+ person.getAddress() + " " + address.getState() + " , " + address.getCity() + " , "
				+ address.getZip());
	}

}
