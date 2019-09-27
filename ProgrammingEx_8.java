
import java.io.*;

public class ProgrammingEx_8 {	
		//dictionary of top 2K words
		
    public static void main(String[] args) {  
        
		PE8Obj [] objects= new PE8Obj[26];
		for(int i = 0; i < objects.length; i++) {
			objects[i] = new PE8Obj();
		}
		fromCypher(objects);  
        top3(objects);

     } // main

     //  reads fileName and returns the contents as String array
     //  with each line of the file as an element of the array
     public static String [] getFileContents(String fileName){

         String [] contents = null;
         int length = 0;
         try {

            // input
            String folderName = ""; // if the file is contained in the same folder as the .class file, make this equal to the empty string
            String resource = fileName;

			// this is the path within the jar file
			InputStream input = ProgrammingEx_8.class.getResourceAsStream(folderName + resource);
			if (input == null) {
				// this is how we load file within editor (eg eclipse)
				input = ProgrammingEx_8.class.getClassLoader().getResourceAsStream(resource);
			}
			BufferedReader in = new BufferedReader(new InputStreamReader(input));	
            
            
            
            in.mark(Short.MAX_VALUE);  // see api

            // count number of lines in file
            while (in.readLine() != null) {
              length++;
            }

            in.reset(); // rewind the reader to the start of file
            contents = new String[length]; // give size to contents array

            // read in contents of file and print to screen
            for (int i = 0; i < length; i++) {
              contents[i] = in.readLine();
            }
            in.close();
        } catch (Exception e) {
            System.out.println("File Input Error");
        }

        return contents;

     } // getFileContents

     public static void fromCypher(PE8Obj [] objects) {
    	
 		String [] unCyphered = getFileContents("cypher.txt");
    	 String txt = "";
    	 String text = "";
    	 char [] encrypt = null;
    	 int key = 1;
    	 
    
    	 for(int i = 0; i < unCyphered.length; i++) {
    		 txt += unCyphered[i];
    		 txt += " ";
    	 }
    	 
    	 txt = txt.toUpperCase();
    	 encrypt = txt.toCharArray();
    	 

    	 for(int i = 0; i < 26; i++) {
	    	 for(int j = 0; j < encrypt.length; j++) {
	    		 if(encrypt[j] >= 65 && encrypt[j] <= 90) {
	    			 encrypt[j] += key;
	    		 } if(encrypt[j] > 90) {
	    			 encrypt[j] -= 26;
	    		 }//if
	    		 System.out.print(encrypt[j]);
	    	 }//inner for
	    	 text = new String(encrypt);
	    	 dictionary(text, i, objects);
	    	 objects[i].setWord(text);
	    }//outer for
    	 
    	 

     }//fromCypher
     
     public static void dictionary(String text, int index, PE8Obj [] objects) {
    	 String [] dictionary = getFileContents("dictionary.txt");
    	 int score = 0;
    	 text = text.toLowerCase();
    	 String [] words = text.split(" ");

    	 
    	 for(int i = 0; i < words.length; i++) {    		 
    		 for(int j = 0; j < dictionary.length; j++) {
    			 if(words[i].equals(dictionary[j])) {
        			 score++;
        			}//if
    		 }//inner for    		 
    	 }//outer for
	    System.out.println(score);
    	objects[index].setScore(score);

     }//dictionnaire
     
     public static void top3(PE8Obj [] objects) {
    	 
    	 
    	 
    	 
     }

}  // ProgrammingEx_8
