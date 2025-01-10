//Ryan Jukes
//1-8-25
//HW 20 Part A

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JukesHW20A {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("customerdata.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[,\\s\\n]+");
        int x = 0;

        System.out.println("---------------------------------------");
        System.out.println("    ID  |    Name     |     Balance ");
        System.out.println("---------------------------------------");

     

        while (in.hasNext()) {
            x++;
            int idVal = in.nextInt();
            String nameVal = in.next();
            double balVal = in.nextDouble(); 
            System.err.printf("%06d  |  %8s   |  $%,9.2f  |%n", idVal, nameVal, balVal);
        }
        
    } }
