//Ryan Jukes
//2-3-25
//AT Java Lawn Mower Part B
package MowerProj;

import java.util.Scanner;
import MowerProj.mow.Yard; 
import MowerProj.mow.Mower; 

public class MowBDemo {

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Desired lawn height: ");
    int inpHeight = in.nextInt();
    System.out.print("Desired lawn width:  ");
    int inpWidth = in.nextInt();
    Mower.clearScreen();

    Yard yardD = new Yard(inpHeight, inpWidth);
    Mower mower = new Mower(1, 1);
    double inpHeight2;

    if (inpHeight%2 == 0) {
    inpHeight2 = inpHeight/2;
  } else { 
    inpHeight2 = (inpHeight/2)+1; 
  }
  for (int i = 0; i < inpHeight2; i++) {
    mower.mowLawn(yardD); 
  }
}
}
