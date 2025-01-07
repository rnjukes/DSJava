//Ryan Jukes
//1-6-25
//HW19 Part A

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JukesHW19A {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);

        ArrayList<Integer> templist = new ArrayList<>();
        int mintemp = Integer.MAX_VALUE;

        while (in.hasNextInt()) {
            int currenttemp = in.nextInt();
            templist.add(currenttemp);
            if (currenttemp < mintemp) {
                mintemp = currenttemp;
            } }

             in.close(); 

        for (int currenttemp : templist) {
            if (currenttemp == mintemp) {
                System.out.println(currenttemp+" <= lowest");
            } else {
                System.out.println(currenttemp);
            }
        }

}
}