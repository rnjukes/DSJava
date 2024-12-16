//Ryan Jukes
//12-14-24
//HW 18 Part C
//AT Java

import java.util.Scanner;
import java.util.ArrayList;

public class JukesHW18C {
   public static void main(String[] args) {
    ArrayList<Integer> temps = new ArrayList<>();
    Scanner in = new Scanner(System.in); 

    System.out.println("Enter temperatures (q to quit): ");
    for (String tempinp = ""; !tempinp.equalsIgnoreCase("q"); ) {
        System.out.print("Next: ");
        tempinp = in.nextLine();
        if (tempinp.equalsIgnoreCase("q")) {
            break;
        } else {
            temps.add(Integer.parseInt(tempinp)); 
        }
    }

    int minTemp = temps.get(0);
    for (int tem : temps) {
        if (tem < minTemp){
        minTemp = tem; 
    } }






    System.out.printf("\nTemperatures: \n");
    for (int tem : temps) {
        if (tem == minTemp) {
            System.out.printf("%d <= lowest temperature\n", tem);
        } else {
            System.out.printf("%d%n", tem);
        }
    } 
    }

   
} 