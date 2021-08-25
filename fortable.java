import java.util.Scanner;


public class tables {

	public static void main(String[] args) {
		int sum;
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter number");
		int a =scanner.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			sum = a + i;
			
			System.out.println(+a+ " x "+i+ " = " +sum );
		}
 

	}

}
