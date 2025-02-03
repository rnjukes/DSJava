package MowerProj;
//Ryan Jukes
//2-2-25
//AT Java Lawn Mower Part A cont.

import java.util.Scanner; 
import MowerProj.mow.Yard; 

public class MowADemo {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush(); }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Lawn height: ");
        int inpHeight = in.nextInt();
        System.out.print("Lawn width:  ");
        int inpWidth = in.nextInt();
        clearScreen();

        Yard yardA = new Yard(inpHeight,inpWidth); 
        yardA.spawnYard();
        System.out.println();
        System.out.println("Height: "+yardA.returnH());
        System.out.println("Width:  "+yardA.returnW());
    }

}
