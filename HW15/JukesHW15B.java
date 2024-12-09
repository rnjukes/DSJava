//Ryan Jukes
//12-8-24
//HW Lesson 15 B

import java.util.Scanner;
import java.util.Arrays;

public class JukesHW15B {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int[] vals = new int[20];
    int currentvalsize = 0;

    for (int i=0; i<20; i++) {
       if (in.hasNext("Q") || in.hasNext("q")) {
        in.next();
        break;
       } else {
        vals[i] = in.nextInt();
       }
       currentvalsize++;
    }

    for (int i= 0; i < currentvalsize; i++) {
        if (i != currentvalsize-1) {
            System.out.println(vals[i]+", ");
        } else {
           System.out.println(vals[i]); 
        }
    }

    System.out.println("");
    System.out.println("Scan for integer: ");
    int intscan = in.nextInt();
    int truescan = 0;
    for (int i = 0; i<currentvalsize; i++) {
        if (vals[i] == intscan) {
            truescan++;
        }
    }
    System.out.println(intscan+" appears at position "+truescan+".");
} }
