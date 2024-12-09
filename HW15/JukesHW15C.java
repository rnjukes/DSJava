//Ryan Jukes
//12-8-24
//HW Lesson 15 C

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class JukesHW15C {
    public static int linearSearch(int[] numbs, int truepos) {
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[1] == truepos) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int RANGE = 10000000;
    int[] realnumbs = new int[RANGE];
    Random rand = new Random();

    for (int i=0; i< RANGE-1; i++) {
        realnumbs[i] = rand.nextInt(RANGE);
    }

    for (int i = 0; i <10; i++){ 
        int truepos = rand.nextInt(RANGE);
        long startLinear = System.currentTimeMillis();
        int linearSearch = linearSearch(realnumbs, truepos);
        long endLinear = System.currentTimeMillis();
        long linearS = endLinear-startLinear;
        
        if (linearSearch != -1) {
            System.out.println(truepos+" exists in the data set");
        } else {
            System.out.println(truepos+" does not exist in the data set");
        }


        Arrays.sort(realnumbs);
        long startBinary = System.currentTimeMillis();
        int binarySearch = Arrays.binarySearch(realnumbs, truepos);
        long endBinary = System.currentTimeMillis();
        long BinaryS = endBinary-startBinary;

         if (binarySearch != -1) {
            System.out.println(truepos+" exists in the data set");
        } else {
            System.out.println(truepos+" does not exist in the data set");
        }

        System.out.println("Linear time to search: "+linearS+"s");
        System.out.println("Binary time to search: "+BinaryS+"s");

        // The linear search mehtod is significantly less efficient than the binary method. This inefficiency is magnified
        // when the overall size of the array becomes larger.
    } } }
