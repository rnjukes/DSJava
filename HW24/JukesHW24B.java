//Ryan Jukes
//1-23-24
//AT Java HW 24 Part B

import java.util.Scanner; 

public class JukesHW24B {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Counter pies = new Counter();
    Counter cakes = new Counter();

    while (true) {
        System.out.println("Cake (c) or Pie (p)? (q to quit)");
        System.out.print("Enter choice here: ");

        if (in.hasNext("q")) {
            in.next();
            break;
        } else if (in.hasNext("p")){
            pies.count();
            in.next();
        } else if (in.hasNext("c")) {
            cakes.count();
            in.next();
        }

        System.out.println("");

        if (cakes.getValue()>pies.getValue()) {
            System.out.println("Cake is in the lead!");
        } else if (pies.getValue()>cakes.getValue()){
           System.out.println("Pie is in the lead!");
        } else {
            System.out.println("");
        } 

        System.out.println("Cake: "+cakes.getValue());
        System.out.println("Pie: "+pies.getValue());
    }

} }

 class Counter {
   private int count = 0;

   public int getValue() {
       return count;
   }
  
   public void count() {
       count = count + 1;
   }

   public void reset() {
       count = 0;
   }
}


