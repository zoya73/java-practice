import java.util.Scanner;

class M_overloading {

    // Method outside main()
      static void area(float r) {
        float area = 3.14f * r * r;
        System.out.println("The area of circle is: " + area);


    }

    public static void main(String[] args) {
        Scanner any = new Scanner(System.in);
        float r = any.nextFloat();

        area(r);   // Method call

        
    }
}