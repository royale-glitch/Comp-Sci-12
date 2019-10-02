package addressbookpackage;

public class OneAddress {


	private String firstName;
	private String lastName;
	private String streetAddress;
	private String streetAddress2;
	private String city;
	private String province;
	private String country;
	private String postalCode;
	
	//avoiding null pointer exceptions
	OneAddress(){
		this.firstName = "";
		this.lastName = "";
		this.streetAddress = "";
		this.streetAddress2 = "";
		this.city = "";
		this.province = "";
		this.country = "";
		this.postalCode= "";
	}
	
	public OneAddress(String myFirstName, String myLastName, String myStreetAddress, String myStreetAddress2, String myCity, String myProvince, String myCountry, String myPostalCode){
		this.firstName = myFirstName;
		this.lastName = myLastName;
		this.streetAddress = myStreetAddress;
		this.streetAddress2 = myStreetAddress2;
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
		return this.streetAddress;
	}
	public String getStreetAddress2() {
		return this.streetAddress2;
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
	public void setStreetAddress(String myStreetAddress) {
		this.streetAddress = myStreetAddress;
	}
	public void setStreetAddress2(String myStreetAddress) {
		this.streetAddress2 = myStreetAddress;
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
	
}//oneAddress
