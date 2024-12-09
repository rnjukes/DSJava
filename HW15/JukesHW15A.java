//Ryan Jukes
//12-8-24
//HW Lesson 15 A

import java.util.Arrays;
import java.util.Scanner;

public class JukesHW15A {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] vals = new int[10];
    int currentvalsize = 0;

    System.out.println("Q to quit. Enter values (ints max 10): ");
    for (int i=0; i<10; i++) { 
        if (in.hasNextInt()) {
            vals[currentvalsize] = in.nextInt();
            currentvalsize++;
        } else if (in.hasNext("Q") || in.hasNext("q")) {
            break;
        } else {
            in.next();
        } }

        for (int i = 0; i<currentvalsize; i++) {
            System.out.print("*"+vals[i]);
        }

        System.out.println();
        Arrays.sort(vals,0,currentvalsize);

        for (int i = currentvalsize-1; i>=0; i--) {
            System.out.print(vals[i]);
            if (i>0) {
                System.out.print(", ");
            }
        }
} }
