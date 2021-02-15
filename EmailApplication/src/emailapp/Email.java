
package emailapp;

import java.util.Scanner;

//Generate an email with the syntax: firstname.lastname@department.company.com
//Determine the department (sales, development, accounting), if none leave blank
//Generate a random String for password
//Have set methods to change the password, set mailbox capacity, and define an alternate email address
//Have get methods to display the name, email, and mailbox capacity
public class Email {

//Properties
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String Company;
	private int mailboxCapacity;
	private String alternateEmail;
	
	
	//Constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + this.lastName);
		
		//Call a method asking for the department and return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:\n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for None\n Enter Department Code:");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if(departmentChoice == 1) {
			return "Sales";
		} else if (departmentChoice == 2) {
			return "Development";
		} else if (departmentChoice == 3) {
			return "Accounting";
		} else {
			return "";}
	}
	//Generate random password
	
	//Set mailbox capacity
	
	//Set alternate email
	
	//Change the password
}