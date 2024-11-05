//Ryan Jukes
//11-4-24
//HW11 Part C

import java.util.Scanner;

public class JukesHW11C {
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);

   System.out.print("Enter radius of sphere: ");
   Double radius = in.nextDouble();
   
   Double sVol = SphereVol(radius);

   System.out.printf("The volume of the sphere is eqaul to %.2f cubic units.\n",sVol);

}

public static double SphereVol(double radius) {
   return (4.0/3.0)*Math.PI*radius*radius*radius;
}
}