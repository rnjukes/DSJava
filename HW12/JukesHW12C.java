//Ryan Jukes
//11-13-24
//HW12 Part C

import java.util.Scanner;
public class JukesHW12C {
    
    public static boolean dvowel (char x) {
        x = Character.toLowerCase(x);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x =='u'; 
    } 

    public static int cvowel (String y) {
        int count = 0;
        for (int i=0; i < y.length(); i++) {
            char x = y.charAt(i);
            if (dvowel(x)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter phrase to scan: ");
    String inPhrase = in.nextLine();

    System.out.println("There are "+cvowel(inPhrase)+" vowels in that phrase");
    }
}
