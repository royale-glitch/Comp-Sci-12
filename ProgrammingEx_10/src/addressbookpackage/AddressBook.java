package addressbookpackage;
import java.util.*;
public class AddressBook {
	  
	private ArrayList <OneAddress> addressBook = new ArrayList<OneAddress>();
	
	//checks if someone is in the book;
	public boolean inBook(String lastName, String firstName) {
		boolean isBook = false;
		
		for(OneAddress i : addressBook) {
				if(i.getLastName().equals(lastName) && i.getFirstName().equals(firstName)) {
					isBook = true;	
					}			
			}
		return isBook;
		
	}//inBook
	
	//Adds a new address to the address book
	public void addAddress(String lastName, String firstName, String address, String address2, 
						   String city, String province, String country, String postalCode) {
		
		OneAddress newAddress = new OneAddress(lastName, firstName, address, address2, 
											   city, province, country, postalCode);
		addressBook.add(newAddress);
		
	}//addAddress
	
	//Removes an address from the address book
	//given the first and last name
	public void removeAddress(String lastName, String firstName) {
		
		for(OneAddress i : addressBook) {
			if(i.getFirstName().equalsIgnoreCase(firstName) && i.getLastName().equalsIgnoreCase(lastName)) {
				addressBook.remove(i);
				break;
			}
		}		
	}//removeAddress
	
	//Prints to the console a "mailing label" for a 
	//single address given the first and last name.
	public void printAddress(String lastName, String firstName) {
		
		for(OneAddress i : addressBook) {
			if(i.getFirstName().equalsIgnoreCase(firstName) && i.getLastName().equalsIgnoreCase(lastName)) {
				System.out.println(i.getFirstName() + " " + i.getLastName() + "\n" + i.getStreetAddress());
				if(i.getStreetAddress2() != null && !i.getStreetAddress2().equalsIgnoreCase("")) {
					System.out.println(i.getStreetAddress2());
				}
				System.out.println(i.getCity() + ", " + i.getProvince() + ", " + i.getCountry() + ", " + i.getPostalCode() + "\n");
			}
		}
	}//printAddress
	
	//Prints to the console a list where each line has three 
	//columns,ordered by name: last name, first name, country. 
	public void printTable() {
		sort();
		System.out.println("Last Name ******** First Name ******** Country");		
		
		//formatting the Strings
		for(OneAddress i : addressBook) {
			System.out.printf("%-19s%-20s%-4s", i.getLastName(), i.getFirstName(), i.getCountry() + "\n");			
		}
		
	}//printTable
	
	//Prints to the console a list of mailing labels, 
	//ordered by name. (last name, then first name.)
	public void printAll() {
		sort();
		for(OneAddress i : addressBook) {
			System.out.println(i.getLastName() + ", "  + i.getFirstName() + "\n" + i.getStreetAddress());
			
			if(i.getStreetAddress2() != null && !i.getStreetAddress2().equals("")) {
				System.out.println(i.getStreetAddress2());
			}
			System.out.println(i.getCity() + ", " + i.getProvince() + 
					", " + i.getCountry() + " " + i.getPostalCode() + "\n");			
		}		
	}//printAll
	
	//Sorts the objects by lastName
	public void sort() {
		Collections.sort(addressBook);
	}

}//AddressBook