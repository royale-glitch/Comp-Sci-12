package addressbookpackage;
import java.util.*;
public class OneAddress {
	ArrayList <AddressBook> addresses = new ArrayList<AddressBook>();
	
	//checks if someone is in the book;
	public boolean inBook(String firstName, String lastName) {
		boolean isBook = false;
		for(int i = 0; i < addresses.size(); i++) {
			if(addresses.getFirstName() != null) {
				
			}
		}
		return isBook;
	}//inBook
	
	
	
	public void addAddress(String lastName, String firstName, String address, String address2, String city, String province,String country, String postalCode) {
		AddressBook newBook = new AddressBook();
		newBook.setFirstName(firstName);
		newBook.setLastName(lastName);
		newBook.setAddress(address);
		newBook.setAddress2(address2);
		newBook.setCity(city);
		newBook.setProvince(province);
		newBook.setCountry(country);
		newBook.setPostalCode(postalCode);
		addresses.add(newBook);
		
	}//addAddress
	

}//AddressBook
