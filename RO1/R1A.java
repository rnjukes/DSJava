package RO1;
/*
Ryan Jukes
4-23-25
RO1 
*/

public class R1A {
 public static void printInverted(int n) {
        if (n <= 0) return; 

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        printInverted(n - 1);
    }

    public static void main(String[] args) {
        printInverted(5);
    }
}
