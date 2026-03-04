import java.util.Scanner; 
// its call the method according to given parameter
class Sum{
    void add(int a,int b){
        System.out.print("The sum is :");
        System.out.print(a+b);
    }
    
    void add(float a){
        System.out.print("The multi is:");
        System.out.print(a*a);
    }
    
    void add(double a,double b){
        System.out.print("The subtr is: ");
        System.out.print(a-b);
    }
    
    
    
}




public class Const{
    public static void main(String []args){
        Scanner any = new Scanner(System.in);

        Sum obj = new Sum();
        obj.add(7);
    }
}