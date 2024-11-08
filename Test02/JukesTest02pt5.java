//Ryan Jukes
//Test 02 Part 5
//11-8-24
//AT Java

public class JukesTest02pt5 {
    public static void main(String[] args) {
        
        int atotal = 0;
        int lTotal = 100;

        for (int i=0; i <= lTotal; i++) {
            atotal += i;
        }

        double avg = (double) atotal/lTotal;

        System.out.println("The average of all the integers from 1 to 100 is: "+avg);
    }
}