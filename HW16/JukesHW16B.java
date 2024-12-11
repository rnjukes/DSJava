//Ryan Jukes
//12-9-24
//HW Lesson 16 A

import java.util.Arrays;
import java.util.Scanner;

public class JukesHW16B {
    public static double avg(double... values) {
        double total = 0;
        int x = 0;

        for (x = 0; x < values.length; x++) {
            total = total + values[x];
        }
        double avg = total / x;
        return avg;
    }

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in) ;
      double[] y = new double[100];
      int currentSize = 0;

      System.out.println("Enter values (q to end): ");
      for (int i = 0; i < y.length; i++) {
        if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break; 
      } else if (in.hasNextDouble()) {
        y[currentSize] = in.nextDouble();
        currentSize++;
      } else {
        in.next();
      } }

      double ans = avg(Arrays.copyOf(y, currentSize));
      System.out.println("The average of the values provided is "+ans);
      
 } }
