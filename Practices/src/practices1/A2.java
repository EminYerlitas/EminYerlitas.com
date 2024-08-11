package practices1;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 String str = scan.next();
		    
		 
	     // Write here your code
	   
	       
	      int numberofbread=0;
	      for(int i=0;i<str.length();i++){
	        if(str.substring(i, i+5).equals("bread")){
	          numberofbread++;
	          
	        }
	        if(numberofbread==2){
	          String[]array=str.split("bread");
	          System.out.println(array[0]);
	          
	        }
	        if(numberofbread==3){
	          String[]array2=str.split("xxbread");
	          String[]array3=array2[0].split("breadyy");
	          System.out.println(array3[0]);
	          
	        }
	        else{
	          System.out.println("nothing");
	          
	        }
	        
	        
	        
	      }
	    
	     
		

	

}}
