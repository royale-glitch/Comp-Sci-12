import java.io.*;

public class ProgrammingEx_8 {	
		
    public static void main(String[] args) {  
		PE8Obj [] objects= new PE8Obj[26];
		String [] iterations = new String[objects.length];
   	 	int [] ranking = new int[objects.length];
   	 	
   	 	//initializing objects
		for(int i = 0; i < objects.length; i++) {
			objects[i] = new PE8Obj();
		}
		
		fromCypher(objects);

	   	 //Transferring the Strings from the object array into a String array
	   	 for(int i = 0; i < objects.length; i++) {
	   		 iterations[i] = objects[i].getWord();
	   	 }
	   	 //Transferring the integers from the object array into an integer array
	   	 for(int i = 0; i < objects.length; i++) {
	   		 ranking[i] = objects[i].getScore();
	   	 }
	   	 
		bubbleSort(iterations, ranking);
		System.out.println("1." + iterations[25]);
		System.out.println("2." + iterations[24]);
		System.out.println("3." + iterations[23]);
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
    	
 		String [] cypherText = getFileContents("cypher.txt");
    	 String txt = "";
    	 String text = "";
    	 char [] encrypt = null;
    	 int key = 1;
    	 
    
    	 for(int i = 0; i < cypherText.length; i++) {
    		 txt += cypherText[i];
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
	    		 //System.out.print(encrypt[j]);
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
	    //System.out.println(score);
    	objects[index].setScore(score);

     }//dictionary
     
     private static void bubbleSort(String[] iterations, int [] ranking) {
    	 int temp = 0;
    	 String temp2 = "";    	 
    	 
    	 for(int i = 0; i < ranking.length; i++) {
    		 for(int j = 1; j < ranking.length; j++){
    			 if(ranking[j-1] > ranking[j]) {
    				 //swap the integers
    				 temp = ranking[j-1];
    				 ranking[j-1] = ranking[j];
    				 ranking[j] = temp;
    				 //swap the Strings
    				 temp2 = iterations[j-1];
    				 iterations[j-1] = iterations[j];
    				 iterations[j] = temp2;
    			 }//if
    		 }//inner for
    	 }//outer for
    	 for(int i = 0; i < ranking.length; i++) {
    		 System.out.println(ranking[i]);
    	 }
    	
     }//bubbleSort    
     
}  // ProgrammingEx_8