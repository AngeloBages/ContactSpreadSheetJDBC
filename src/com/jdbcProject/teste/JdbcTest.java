package com.jdbcProject.teste;


import java.sql.SQLException;
import java.util.Scanner;

import com.jdbcProject.ContactManager;

public class JdbcTest {
	
	private static Scanner scanner = new Scanner(System.in);
	ContactManager cm = new ContactManager();
	
	public static void main(String[] args) {
		
		JdbcTest jdbcTest = new JdbcTest();
		jdbcTest.start();
	}
	
	public void start() {
		System.out.println("\t\tCONTACT SPREADSHEET");
		
		final int EXIT = 0;
		int option = Integer.SIZE;
		
		while(option != EXIT) {
			System.out.print("\n\n [1]-ADD contact\n "
					            + "[2]-GET contact\n "
					            + "[3]-LIST contacts\n "
					            + "[4]-UPDATE contact\n "
					            + "[5]-DELETE contact\n "
					            + "[0]-Exit");
			
			option = Integer.parseInt(scanner.nextLine());
			
			try {
				
				switch(option) {
				
				case 1:
					cm.insertContact();
					break;
				
				case 2:
					cm.getContact();
					break;
					
				case 3:
					cm.listContacts();
					break;
					
				case 4:
					cm.updateContact();
					break;
					
				case 5:
					cm.deleteContact();
					break;
					
				default:
					break;
			}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
