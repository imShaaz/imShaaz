package guii;

import java.util.Scanner;

public class calc {
	public static int main(String[] args) {
		// TODO Auto-generated method stub
		
		    int input ; int a ; int b; int c;
		    @SuppressWarnings("resource")
			Scanner scan =new Scanner(System.in);
		    System.out.println("calculator using is else");
			System.out.println("enter a");
		    a = scan.nextInt();
		    System.out.println("enter b");
		    b = scan.nextInt();
	
		    System.out.println("chose option from the menu");
		    System.out.println("1.add\n");
		    System.out.println("2.minus\n");
		    System.out.println("3.multiply\n");
		    System.out.println("4. divide\n");
		    System.out.println("5. modulus\n");
		    input = scan.nextInt();
		    if(input == 1)
		    {
		        c=a+b;
		        System.out.println("addtion of "+a+ "and " +b+"is ="+c);
		    }
		    else if(input == 2)
		    {
		        c=a-b;
		        System.out.println("substraction of "+a+ "an d"+b+" is ="+c);
		    }else if(input == 3)
		    {
		        c=a*b;
		        System.out.println("multiplication of "+a+ "an d"+b+" is ="+c);
		    }
		    else if(input == 4)
		    {
		        c=a/b;
		        System.out.println("div of "+a+ "an d"+b+" is ="+c);
		    }
		    else if(input == 5)
		    {
		        c=a%b;
		        System.out.println("modulus 5of "+a+ "an d"+b+" is ="+c);
		    }
		    else
		    {
		        System.out.println("invalid\n");
		    }
		return 0;

}
)
