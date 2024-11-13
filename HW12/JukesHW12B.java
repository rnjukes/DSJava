//Ryan Jukes
//11-13-24
//HW12 Part B

import java.util.Scanner;
public class JukesHW12B {
  
    public static double snumb(double x, double y, double z) {
            if (x <= y && x <= z) {
                return x;
            } else if (y <= x && y <= z) {
                return y;
            } else {
                return z;
        } }
    
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number:  ");
            double a = in.nextDouble();
            System.out.print("Enter second number: ");
            double b = in.nextDouble();
            System.out.print("Enter third number:  ");
            double c = in.nextDouble();
    
            System.out.println(snumb(a,b,c)+" is the smallest of those numbers");

    }

}
