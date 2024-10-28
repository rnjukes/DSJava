//Ryan Jukes
//10-28-24
//Lesson 09 HW Part C

import java.util.Random;
import java.util.Scanner; 

public class JukesHW09C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum10 = 0;

 Random randomNumb = new Random();  
        for (int refNumb = 0; refNumb < 10; refNumb++) {
            int trueRandomNumb = randomNumb.nextInt(10);
            System.out.println(trueRandomNumb);
            sum10 += trueRandomNumb; 
    }
   double avg10 = (sum10/10);
System.out.printf("The average of these numbers is "+avg10);

int sum1000 = 0;
for (int refNumb = 0; refNumb < 1000; refNumb++) {
    int trueRandomNumb = randomNumb.nextInt(10)+1;
    System.out.println(trueRandomNumb);
    sum1000 += trueRandomNumb; 
}
double avg1000 = (sum1000/1000);
System.out.printf("The average of these numbers is "+avg1000);
System.out.println();
}
}
//The average found in both cases makes sense as the outcome of the generated numbers is completely random, so an outcome that
//isn't an exact average or 5 should be expected for the average of ten random numbers 1-10, but the larger sample of random 
//numbers in the 1-1000 range allows for one to accurateley predict the average will almost always be 5.