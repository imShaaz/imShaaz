package guii;  
{
import java.util.Scanner;

public class mintoyr {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of minutes:");
    
    int min = input.nextInt();

     
    int yr = minutes / 525600;
    int da = minutes / 1440;
    int remmin = day % 525600;


    System.out.println(min + " minutes is " + yr + " years and "  +  remmin + " days ");
    }

   }
}
