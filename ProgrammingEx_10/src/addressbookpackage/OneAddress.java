package addressbookpackage;

public class OneAddress implements Comparable<OneAddress> {

	private String firstName;
	private String lastName;
	private String address;
	private String address2;
	private String city;
	private String province;
	private String country;
	private String postalCode;
	
	//default constructor
	OneAddress(){
		this.firstName = "";
		this.lastName = "";
		this.address = "";
		this.address2 = "";
		this.city = "";
		this.province = "";
		this.country = "";
		this.postalCode= "";
	}
	
	public OneAddress(String myFirstName, String myLastName, String myAddress, String myAddress2, String myCity, String myProvince, String myCountry, String myPostalCode){
		this.firstName = myFirstName;
		this.lastName = myLastName;
		this.address = myAddress;
		this.address2 = myAddress2;
		this.city = myCity;
		this.province = myProvince;
		this.country = myCountry;
		this.postalCode= myPostalCode;
		
	}
	
	//all getters
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public String getStreetAddress() {
		return this.address;
	}
	public String getStreetAddress2() {
		return this.address2;
	}
	public String getCity() {
		return this.city;
	}
	public String getProvince() {
		return this.province;
	}
	public String getCountry() {
		return this.country;
	}
	public String getPostalCode() {
		return this.postalCode;
	}
	
	//all setters
	public void setFirstName(String myFirstName) {
		this.firstName = myFirstName;
	}
	
	public void setLastName(String myLastName) {
		this.lastName = myLastName;
	}
	public void setAddress(String myAddress) {
		this.address = myAddress;
	}
	public void setAddress2(String myAddress2) {
		this.address2 = myAddress2;
	}
	public void setCity(String myCity) {
		this.city = myCity;
	}
	public void setProvince(String myProvince) {
		this.province = myProvince;
	}
	public void setCountry(String myCountry) {
		this.country = myCountry;
	}
	public void setPostalCode(String myPostalCode) {
		this.postalCode = myPostalCode;
	}
	
	public int compareTo(OneAddress a) {
		if(lastName.compareToIgnoreCase(a.getLastName()) == 0 && firstName.compareToIgnoreCase(a.getFirstName()) == 0) {
		return 0;
		} else if(lastName.compareToIgnoreCase(a.getLastName()) > 0) {
			return 1;
		} else {return -1;}
	}
	
}//oneAddress