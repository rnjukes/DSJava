//Ryan Jukes
//12-14-24
//HW 18 Part D
//AT Java

import java.util.ArrayList;
import java.util.Scanner;

public class JukesHW18D {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner in = new Scanner(System.in); 

    System.out.println("Enter values (q to quit): ");
    for (String ninp = ""; !ninp.equalsIgnoreCase("q"); ) {
        System.out.print("Next: ");
        ninp = in.nextLine();
        if (ninp.equalsIgnoreCase("q")) {
            break;
        } else {
            numbers.add(Integer.parseInt(ninp)); 
        }
    }

    for (int i = 0; i < numbers.size(); i++) {
        if (numbers.get(i)%2 != 0) {
            numbers.remove(i);
            i--;
        }
    }

    System.out.printf("\nList with no odd numbers: \n");
    for (int ninp : numbers) {
        System.out.println(ninp);
    }
    }
}
