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

	// delete person by name
	public void deleteByName() {
		System.out.println("Enter First name:");
		String firstName = scanner.next();

		Iterator<Person> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();

			if (firstName.equals(person.getFirstName())) {
				list.remove(person);
				System.out.println("Contact deleted successfully...");
			}
		}
	}

}
