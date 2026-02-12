import java.util.Scanner;

class prime{
    public static void main(String [] args){
        Scanner any = new Scanner (System.in);

        System.out.print("Enter the number :");
        int a = any.nextInt();

        boolean isprime = true;

        if(a<=1){
            isprime = false;
        }

        else 
            {
                for ( int i =2;i*i<=a;i++){
                    if (a %i==0){
                       isprime = false;
                       break;
                    }

                }
            }
        

        
        if(isprime)
        {System.out.print(" The number " +a+ " is prime ." );}

        else 
        {System.out.print(" The number " +a+ " is not prime ." );}
    }
}