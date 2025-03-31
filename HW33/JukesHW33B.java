//Ryan Jukes
//3-31-25
//AT Java HW33 B

public class JukesHW33B {
    public static void main(String[] args) {
        Animal bear = new Animal("bear", 700);
        Animal rat = new Animal("rat", 1);

        if (bear.compareTo(rat) == 0) {
            System.out.println("The animals weight the same");
        } else if (bear.compareTo(rat) == 1) {
            System.out.println("The bear weighs more than the rat");
        } else if (bear.compareTo(rat) == -1) {
            System.out.println("The rat weighs more than the bear");
        }

    }
}

