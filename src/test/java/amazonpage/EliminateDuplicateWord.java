package amazonpage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EliminateDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String word = "Gowtham Jamal Leelavathy Jamal Abirami Azees Azees";
		String str = "sandeejjkkp";
		Set<String> se = new HashSet<>();
		Set<String> dup = new HashSet<>();
		Set<Character> sd = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		String[] sperword = word.split("\\s+");
		
		 * for(int i = 0; i<str.length();i++) {
		 * 
		 * Character c = str.charAt(i);
		 * 
		 * if(!sd.contains(c)) {
		 * 
		 * sd.add(c); //sf.append(c); }
		 * 
		 * else { sf.append(c); //break; }
		 * 
		 * 
		 * } System.out.println(sf.toString());}
		 
		
		  for(String sper:sperword) 
		  {if(!se.contains(sper))
		  { se.add(sper);} else {
		 
		 dup.add(sper); }
		  
		 } System.out.println(se);
		  
		 System.out.println("dup: "+ dup); }*/
		
		/*
		String str = "Automation test";
	       String reverse = "";
	       str.trim();
	       String[] st = str.split("\\s+");
	      
	       for(String s:st){
	           for(int i=s.length()-1; i>=0;i--){
	              
	              reverse +=  s.charAt(i); 
	               
	           }reverse +=" ";
	       }System.out.println(reverse);
	       
	       
	       String input = "Automation test";

	        // Step 1: Convert the string to a character array
	        char[] charArray = input.toCharArray();

	        // Step 2: Initialize an empty string to store the reversed string
	        String reversed = "";

	        // Step 3: Loop through the character array in reverse order
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            reversed += charArray[i];  // Append each character to the reversed string
	        }

	        // Step 4: Print the reversed string
	        System.out.println("Reversed String: " + reversed);
	    }*/

		 

		int[] a = {20,30,21,30,31,45,20,56};
		
		
		//ArrayList<Integer> ab = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			//if(!ab.contains(a[i]))
			//{
				//ab.add(a[i]);
			//}
		int k=0;
		for(int j =0; j<a.length;j++)
		{
			if(a[i] == a[j])
			{
				k++;
			}
			
		}
				//System.out.println(a[i]);
		
		if(k>=2) 

			System.out.println("Duplicate : " +a[i]);
		else 
		{
			System.out.println("Without Dup : " +a[i]);
			
		}
						 

		}
		
		

		 
	    
	
		
		
		
		
		
		
	}}
