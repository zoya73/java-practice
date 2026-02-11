import java.util.Scanner;

// code for odd and even number.
public class second{
public static void main(String [] args) {
Scanner any = new Scanner(System.in);

System.out.print("Enter the number you want to check:");
int a = any.nextInt();

if (a%2==0)
   System.out.println(" The number " +a+ " is even." );
  

else 
   System.out.println(" The number " +a+ " is odd." );
  
}
  
}