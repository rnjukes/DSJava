//Ryan Jukes
//1-14-24
//AT Java HW22 A

import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException; 

public class JukesHW22A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      while (true) {
        System.out.println("Enter filename (# to quit)");
        String fName = in.nextLine();


        if (fName.equals("#")) {
            System.out.println("Done!");
            break;
        }

        try {
            File file = new File(fName);
            Scanner fScanner = new Scanner(file);
            
            while (fScanner.hasNext()) {
                String uhhh = fScanner.next();
                System.out.println(uhhh);
            }   
        } catch (FileNotFoundException exception) {
            System.err.println("File not found");
            break;

      }
    }
} }
