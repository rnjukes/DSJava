//Ryan Jukes
//1-14-24
//AT Java HW22 B

import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException; 

public class JukesHW22B {
    public static void main(String[] args) throws FileNotFoundException {
        File nfile = new File("birthyears.txt");
        Scanner in = new Scanner(nfile);

        while (in.hasNextLine()) {
            String fline = in.nextLine();
            Scanner lIn = new Scanner(fline);  
            lIn.useDelimiter(",");

            String name = lIn.next().trim();

            try {
                double byear = Double.parseDouble(lIn.next().trim());
                System.out.printf("%s was born in %4.0f%n", name, byear); 
            } catch (NumberFormatException error) {
                System.out.printf("%s's birth year is unknown\n", name);
            }
        }
        
    }
}
