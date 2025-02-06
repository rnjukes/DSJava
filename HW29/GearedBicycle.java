package HW29;

public class GearedBicycle extends Bicycle{
    private final int MAX_GEARS = 6;
    private int gear = 1;
    private final int GEARED_MAX_SPEED = 50;
    public GearedBicycle(){
        super();
        gear = 1;
    }
    public int getGear(){
        return gear;
    }

    public void setGear(int gear){
        if (gear>0&&gear<MAX_GEARS){
            this.gear = gear;
        }
    }
    public void shiftUp(){
        gear++;
        if(gear>MAX_GEARS){
            gear = MAX_GEARS;
        }
    }
    public void shiftDown(){
        gear--;
        if(gear<1){
            gear = 1;
        }
    }
    public void pedal(){
        int newSpeed = getSpeed()+getGear();
        if(newSpeed>GEARED_MAX_SPEED){
            newSpeed = GEARED_MAX_SPEED;
        }
        setSpeed(newSpeed);
    }
    public void display(){
        System.out.printf("Gear = %02d%n", getGear());
        super.display();
    }
    public static void main(String[] args) {
        GearedBicycle g = new GearedBicycle();
        System.out.println(g.getSpeed());
        g.pedal();
        System.out.println(g.getSpeed());
    }
}
