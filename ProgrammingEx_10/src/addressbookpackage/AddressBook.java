package addressbookpackage;
import java.util.*;
public class AddressBook {
	  
	private ArrayList <OneAddress> addressBook = new ArrayList<OneAddress>();
	//checks if someone is in the book;
	
	public boolean inBook(String firstName, String lastName) {
		boolean isBook = false;
		
		for(OneAddress i : addressBook) {
				if(i.getFirstName().equals(firstName) && i.getLastName().equals(lastName)) {
					isBook = true;
				} else {isBook = false;}
			
			}
		return isBook;
		
	}//inBook	
	
	public void addAddress(String lastName, String firstName, String address, String address2, 
						   String city, String province, String country, String postalCode) {
		OneAddress newAddress = new OneAddress(lastName, firstName, address, address2, 
											   city, province, country, postalCode);
		addressBook.add(newAddress);
		
	}//addAddress
	

}//AddressBook
