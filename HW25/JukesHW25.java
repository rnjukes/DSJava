//Ryan Jukes
//1-29-25
//AT Java HW 25

import java.util.Scanner;

public class JukesHW25 {

    private double cSpeed = 0;

    public void acc() {
        if (cSpeed<120) {
            cSpeed = cSpeed +1;
        }
     }

    public void brake() {
        cSpeed = cSpeed - 0.1;
    }

    public JukesHW25(double speed) {
        if (speed<120) {
            cSpeed = speed; 
        }
    }

    public double showSpeed() {
        return cSpeed;
    }

     public JukesHW25() {
        cSpeed=0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JukesHW25 Car = new JukesHW25();

        System.out.print("Enter starting speed: ");
        Car = new JukesHW25(in.nextDouble());
        System.out.println("brake (b), accelerate (a), or quit (q)?");

        while (true) {
            System.out.print("Input: ");

            if ((in.hasNext("q") || in.hasNext("Q"))) {
                in.next();
                break;
            } else if ((in.hasNext("a") || in.hasNext("A"))) {
                Car.acc();
                in.next();
            } else if ((in.hasNext("b") || in.hasNext("B"))) {
                Car.brake();
                in.next();
            } else {
                in.next();
                System.out.println("Invalid input");
            }
        System.out.printf("Current speed: %.2f\n", Car.showSpeed());
    }
} }
