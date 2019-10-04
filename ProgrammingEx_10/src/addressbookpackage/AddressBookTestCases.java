package addressbookpackage;

public class AddressBookTestCases {
	
	static void addToBook(AddressBook book){
        book.addAddress("Vader", "Darth", "Sith Lord Office", null,
                        "The Death Star", "Galaxy", "Universe", "FFA");
        book.addAddress("Wong", "George", "308-3221 Village Green Way", null,
                        "Squamish", "BC", "Canada", "V8B 0R7");
        book.addAddress("Knop", "Rob", "University of Victoria", "3200 Ring Rd.",
                         "Victoria", "BC", "Canada", "V8N 1M5");
        book.addAddress("Marvin", "Neal", "Costco", "799 McCallum Rd.",
                        "Langford", "BC", "Canada", "V9B 6A2");
        book.addAddress("Chakrabarty", "Deepto", "Target", "3201 Nw Randall Way",
                        "Silverdale", "WA", "USA", "98383");
        book.addAddress("Dog", "Scottie", "Carnegie Mellon University",
                        "5000 Forbes Ave", "Pittsburgh", "PA", "USA", "15213");
    }
    
    public static void main(String args[]) {    	
        AddressBook book = new AddressBook();
        //addToBook(book);
        
        book.addAddress("Narayan", "Surya", "3987 Gordon Head rd", "",  "Victoria", "BC", "Canada", "V8N 3X5");
        book.printAddress("Narayan", "Surya");
        
        // Do the other tests here
    }

}
