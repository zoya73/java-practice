import java.util.*;

class Over_l{

    int sum(int a,int b){
            return a + b;
    }

    int sum(int a ,int b ,int c){
        return a+b+c;
    }

    public static void main(String []args){
        System.out.print("Enter the value a,b and c:");
        Scanner any = new Scanner(System.in);
        int a = any.nextInt();
        int b = any.nextInt();
        int c = any.nextInt();

        Over_l obj = new Over_l();
        System.out.println("The sum of a and b is :" +obj.sum(5,8));
        System.out.println("The sum of a , b and c is :" +obj.sum(4,8,9));
    }
}