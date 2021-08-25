package guii;

import java.util.Scanner;

public class swtches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
		 // switch = statement that allows a variable to be tested for equality against a list of values
		Scanner scan =new Scanner(System.in);  
		System.out.println("what day is it ?");
		  String day = scan.nextLine();
			  
		  switch(day) {
		   case "Sunday": System.out.println("It is Sunday a holiday!");
		   break;
		   case "Monday": System.out.println("Oh no It is Monday!");
		   break;
		   case "Tuesday": System.out.println("It is Tuesday! :D");			   
		   break;
		   case "Wednesday": System.out.println("It is Wednesday! XD");	  
		   break;
		   case "Thursday": System.out.println("It is Thursday! :)");
		   break;
		   case "Friday": System.out.println("It is Fridayyy!");
		   break;			   
		   case "Saturday": System.out.println("It is Saturday weekend!");
		   break;
		   default: System.out.println("invaild user input!");
	  }
			    
	 }
	
	}
