//Ryan Jukes
//2-3-25
//AT Java Lawn Mower Part B
package MowerProj;

import java.util.Scanner;
import MowerProj.mow.Yard; 
import MowerProj.mow.Mower; 

public class MowBDemo {
    public static void clearScreen() {
     System.out.print("\033[H\033[2J");
     System.out.flush();
    }

    public static void delay(long mseconds) {
       try {
           Thread.sleep(mseconds);
       } catch (InterruptedException e) {
           System.err.println("InterruptedException received!");
       }
   }

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Desired lawn height: ");
    int inpHeight = in.nextInt();
    System.out.print("Desired lawn width: ");
    int inpWidth = in.nextInt();
    clearScreen();

    Yard yardD = new Yard(inpHeight, inpWidth);
    Mower mower = new Mower(1, 1);

    while (mower.forwardFramework(yardD)) {
        clearScreen();
        mower.changeSymbol(yardD);
        yardD.spawnYard(mower);
        delay(500);
        mower.goForward(yardD);
    }
  }
}
