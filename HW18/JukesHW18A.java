//Ryan Jukes
//12-14-24
//HW 18 Part A
//AT Java

import java.util.Scanner;
import java.util.ArrayList;

public class JukesHW18A {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    ArrayList<String> names = new ArrayList<String>(); 

    System.out.println("Enter names to add to list (# to quit): ");
    for (String nameinp = "";;) {
        System.out.print("Next: ");
        nameinp = in.nextLine();
        if (nameinp.equals("#")) {
            break;
        }
        names.add(nameinp);
    }
    System.out.println("");
    System.out.println("List of names: ");
    for (String nameSing : names) {
        System.out.println(nameSing);
    }
}
}
    
