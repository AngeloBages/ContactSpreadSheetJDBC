package com.jdbcProject;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.jdbcProject.dao.ContactDaoImpl;
import com.jdbcProject.dao.Dao;
import com.jdbcProject.models.Contact;

public class ContactManager {

	private static Scanner scanner = new Scanner(System.in);
	private Dao<Contact> contactDao;
	
	public ContactManager() {
		contactDao = new ContactDaoImpl();
	}
	
	private Contact createContact() {
		String name;
		String email;
		String address;
		LocalDate birthDate;
		
		System.out.println("\n\t\tContact");
		System.out.print("\n\n Name: ");
		name = scanner.nextLine();
		
		System.out.print("\n Email: ");
		email = scanner.nextLine();
		
		System.out.print("\n Address: ");
		address = scanner.nextLine();
		
		System.out.print("\n Date of Birth (EX: dd/mm/yyyy): ");
		String date = scanner.nextLine();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		birthDate = LocalDate.parse(date, dateFormatter);
		
		return new Contact(name, email, address, birthDate);
	}
	
	public void insertContact() throws SQLException {
		Contact contact = createContact();
		
		contactDao.insert(contact);
		System.out.println("\n\nContact created successfully!");
	}
	
	public void getContact() throws SQLException {
		
		System.out.print("\n\n Enter the ID of the contact to be updated\n ");
		int id = Integer.parseInt(scanner.nextLine());
		Contact contact = contactDao.get(id);
		
		System.out.println("\n\n\tCONTACTS");
		System.out.println("\tId\tName\t\tEmail\t\t\tAddress\t\tDate of Birth\n");
		
		System.out.println("\t" + contact.getId() + "\t"
				                + contact.getName() + "\t"
                                + contact.getEmail() + "\t"
                                + contact.getAddress() + "\t"
                                + contact.getBirthDate()
                          );
		
	}
	
	public void listContacts() throws SQLException {
		System.out.println("\n\n\tCONTACTS");
		System.out.println("\tId\tName\t\tEmail\t\t\tAddress\t\tDate of Birth\n");
		
		contactDao.getList().forEach((contact) -> System.out.println("\t" + contact.getId() + "\t"
																			  + contact.getName() + "\t"
		                                                                      + contact.getEmail() + "\t"
		                                                                      + contact.getAddress() + "\t"
		                                                                      + contact.getBirthDate()
		                                                                  ));
	}
	
	public void updateContact() throws SQLException {
		
		System.out.print("\n\n Enter the ID of the contact to be updated\n ");
		int id = Integer.parseInt(scanner.nextLine());
		
		Contact contact = createContact();
		
		contactDao.update(id, contact);
		System.out.println("\n\nContact updated successfully!");
	}
	
	public void deleteContact() throws SQLException {
		System.out.print("\n\n Enter the ID of the contact to be deleted\n ");
		int id = Integer.parseInt(scanner.nextLine());
		
		contactDao.delete(id);
		System.out.println("\n\nContact deleted successfully!");
	}
}
