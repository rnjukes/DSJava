package HW31;
//Ryan Jukes
//2-11-25
//AT Java HW 31 Part A

import HW31.BaseballCard;

public class JukesHW31A {
    public static void main(String[] args) {
        BaseballCard Devers = new BaseballCard("Rafael Devers", 2020);
        BaseballCard DeversCopy = new BaseballCard("Rafael Devers", 2020);
        System.out.println(Devers.toString());

        if (Devers.equals(DeversCopy)) {
            System.out.println("The cards are equal");
        } else {
            System.out.println("The cards are not the same");
        }
     }
}
