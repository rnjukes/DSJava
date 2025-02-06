package HW29;
//Ryan Jukes
//2-5-25
//AT Java HW 29 Part A

public class JukesHW29A extends GearedBicycle {
    public void brake() {
        int bSpeed = getSpeed();
        int bLevel = (getGear()+ 1);
        int net = bSpeed - bLevel;
        setSpeed(net);  
    }

    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        JukesHW29A a = new JukesHW29A();
        bike.setSpeed(5);
        a.setSpeed(5);
        a.shiftUp();
        a.shiftUp();
        bike.brake();
        a.brake();
        bike.display();
        a.display();
    }
}
