package practice.codesignal;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        // Initialize an empty ArrayList of strings named 'suitcase'
    	ArrayList<String> suitcase = new ArrayList<>();
    	
        // TODO: Add items to your suitcase
    	suitcase.add("Ativan");
    	suitcase.add("Xanax");
    	suitcase.add("Vapes");
    	suitcase.add("Marijuana");
    	suitcase.add("Methadose");
    	suitcase.add("Concerta");
    	
        // Declare a string variable for your goodbye message
    	String goodbye = "Adios dudes";
    	
        // TODO: Assign a farewell message to the variable

        // Access the first and last item in your suitcase
    	String first = suitcase.get(0);
    	String last = suitcase.get(suitcase.size()-1);
    	
        // TODO: Print the first item
    	System.out.println(first);
    	
        // TODO: Print the last item
    	System.out.println(last);

        // Send off with a farewell in uppercase
    	System.out.println(goodbye.toUpperCase());
    	
        // TODO: Convert and print the farewell message in uppercase
    	
	}

}
