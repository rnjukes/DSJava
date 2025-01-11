//Ryan Jukes
//1-10-25
//HW 21 Part B

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JukesHW21B {
    public static void main(String[] args) throws FileNotFoundException {
    File inputFile = new File("sales_by_cat.txt"); 
    Scanner in = new Scanner(inputFile); 

    while (in.hasNextLine()) {
        String printStat = in.nextLine();
        Scanner lineScanner = new Scanner(printStat);
        lineScanner.useDelimiter(",\\s*");
        double sales;

        String catagory = lineScanner.next();
        String person = lineScanner.next();

         if (lineScanner.hasNextDouble()) {
            sales = lineScanner.nextDouble(); 
        } else {
            sales = 0.0;
        }

        System.out.printf("%-14s    |    %-10s    |   $%10.2f%n", catagory, person, sales);

    }

} }