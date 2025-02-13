//Ryan Jukes
//2-3-25
//AT Java Lawn Mower Part B
package MowerProj;

import java.util.Scanner;
import MowerProj.mow.Yard; 
import MowerProj.mow.Mower; 
import java.util.Random;

public class MowBDemo {

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Desired lawn height: ");
    int inpHeight = in.nextInt();
    System.out.print("Desired lawn width:  ");
    int inpWidth = in.nextInt();
    Mower.clearScreen();
  
    Yard yardD = new Yard(inpHeight, inpWidth);
    Mower mower = new Mower(1,1,0);

  for (int i = 0; i < inpHeight; i++) {
  mower.mowLawn(yardD); 
  }
}
}
