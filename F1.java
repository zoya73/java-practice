import java.util.Scanner;
class F1{
    // want to display the sum of array,taking user input.
    public static void main(String []args){
        Scanner any = new Scanner(System.in);
        int a [] = new int [4];//array initalization
        int sum = 0;

        System.out.println("Enter the number you want to sum :");
        for(int i=0;i<4;i++){
            a[i] = any.nextInt();
            sum += a[i];
        }
        System.out.println("The sum of array is :"+sum);
    }
}