//Ryan Jukes
//10-22-24
//AT 03 Challenge Problems

import java.util.Scanner;
public class JukesAT03BC {
    public static void main(String[] args) throws Exception  {
        Scanner in = new Scanner(System.in);
        //Part 2
        
        System.out.print("Enter a ten digit phone number (no spaces): ");
        String phoneNumb = in.nextLine();

        String start = phoneNumb.substring(0,3);
        String mid = phoneNumb.substring(3,6);
        String end = phoneNumb.substring(6);

        System.out.println("Your phone number is ("+start+")"+mid+"-"+end+".");  

        /* Part 3
        
        1. Get input of the number
        2. Check if the number given in eqaul to 1 or 2, if so, display prime number result
        3. Create a loop that uses modular division that divides by the variable (i)
        4. For every time the equation eqauls 0 add 1 to i
        5. Stop the cycle when i = the given number
        6. If the number of times the loop outputs a number that is not 0, the number is not prime

        */
        
    }
}

