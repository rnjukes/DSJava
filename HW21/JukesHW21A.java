//Ryan Jukes
//1-10-25
//HW 21 Part A

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JukesHW21A {
    public static void main(String[] args) throws FileNotFoundException {
    File inputFile = new File("Top5Unemployment.txt"); 
    Scanner in = new Scanner(inputFile);
    
    System.out.println("---------------------------------------------------------------");
    System.out.println("                    Top 5 Unemployment Rates                   ");
    System.out.println("---------------------------------------------------------------");

    while (in.hasNextLine()) {
        String printStat = in.nextLine();
        Scanner lineScanner = new Scanner(printStat);
        lineScanner.useDelimiter(",\\s*");

        String place = lineScanner.next();

        double stat=0.0;
        int rank=0;

        if (lineScanner.hasNextDouble()) {
            stat = lineScanner.nextDouble(); } 

        if (lineScanner.hasNextInt()) {
            rank = lineScanner.nextInt(); } 
    
        String continent = lineScanner.next();

        System.out.printf("Ranked # %2d: %-14s  | %6.2f%% | %-20s%n", rank, place, stat, continent);  
    }

    System.out.println("---------------------------------------------------------------");
} }
