import java.util.Scanner;
class Cal{
    public static void main(String []args){
        Scanner any = new Scanner(System.in);
        System.out.println("Enter the value a :");
        int a = any.nextInt();
        System.out.println("Enter the value b :");
        int b = any.nextInt();
        System.out.println(" 1.addition\n 2.subtraction\n 3.divide\n 4.modulus\n 5.multiplication\n");
        System.out.println(" Enter the operator you want into the list :");
        char operator = any.next().charAt(0);

        

        switch(operator){
            case '+':
                System.out.print("The addition of the number is :");
                System.out.print(a+b);
                break;
            case '-':
                System.out.print("The subtraction of the number is :");
                System.out.print(a-b);
                break;    
            case '/':
                System.out.print("The divide of the number is :");
                System.out.print(a/b);
                break;
            case '%':
                System.out.print("The modulus of the number is :");
                System.out.print(a%b);
                break;
            case '*':
                System.out.print("The multi of the number is :");
                System.out.print(a*b);
                break;
            default:
                System.out.print("May you wirte something wrong\n your choice is out of the list \n thanku for comming");
        }
    }
}