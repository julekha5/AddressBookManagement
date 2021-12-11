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

	
	// Edit person details
	public void updatePerson() {
		System.out.println("Enter the person name for update");
		String firstName = scanner.next();

		Iterator<Person> iterator = list.listIterator();

		while (iterator.hasNext()) {
			Person person = iterator.next();

			if (firstName.equals(person.getFirstName())) {
				Address address = person.getAddress();

				System.out.println("Edit the details of person");
				System.out.println("Choose field you want to add:");
				System.out.println(
						"1.First Name\t2.Last Name\t3.Email\t4.Phone Number\t5.State\t6.City\t7.Zip\t8.Default");
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("Enter first Name");
					String firstName1 = scanner.next();
					person.setFirstName(firstName1);
					break;
				case 2:
					System.out.println("Enter last Name");
					String lastName = scanner.next();
					person.setLastName(lastName);
					break;
				case 3:
					System.out.println("Enter Email");
					String email = scanner.next();
					person.setEmail(email);
					break;
				case 4:
					System.out.println("Enter phone number");
					String phoneNumber = scanner.next();
					person.setPhoneNumber(phoneNumber);
					break;
				case 5:
					System.out.println("Enter state");
					String state = scanner.next();
					address.setState(state);
					break;
				case 6:
					System.out.println("Enter city");
					String city = scanner.next();
					address.setState(city);
					break;
				case 7:
					System.out.println("Enter zip");
					long zip = scanner.nextInt();
					address.setZip(zip);
					break;
				default:
					System.out.println("Exit");

				}
			} else {
				System.out.println("Person not found");
			}
		}
	}

}
