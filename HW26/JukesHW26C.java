//Ryan Jukes
//1-31-25
//AT Java HW26 C

/* 
public class JukesHW26C {
    public static void main(String[] args) {
       Customer.lastSerialUsed = 100;
       Customer c1 = new Customer("Sal's Deli");
       c1.addSale(100);
       Customer c2 = c1;
       c2.addSale(50);
       System.out.println(c1.getSales());
       System.out.println(c2.getSales());

    }
} */

// The code returns the output 150   150. This is becuase the varibles c1 and c2 are the same object in the 
// memory of the code. The functiom isn't properly overloaded like it should be in order for the logic error
// to not occur.
