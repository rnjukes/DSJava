//Ryan Jukes
//11-6-24
//AT07 Part B

import java.util.Scanner;
class Plane {
    private double x = 0;
    private double y = 0;
    private double r = 0;
    private double thet = 0;

    public Plane (double xVal, double yVal) {
        x = xVal;
        y = yVal;
        r = Math.sqrt((x*x)+(y*y));
        thet = Math.atan2(y, x);
    }

public double pullX() {
    return x;
}

public double pullY() {
    return y;
}

public double pullR() {
    return r;
}

public double pullT() {
    return thet;
}

public double pullTD() {
    return Math.toDegrees(thet);
}

public void createFinalValue(double dX, double dY) {
    x = x+dX;
    y = y+dY;
    r = Math.sqrt((x*x)+(y*y));
    thet = Math.atan2(y, x);
}
public double distanceFind (Plane newnum) {
    double dex = x - newnum.x;
    double dey = y - newnum.y; 
    return Math.sqrt((dex*dex)+(dey*dey));
}

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
Plane pointOne = new Plane(3,4);

System.out.println("Point (1) at ("+pointOne.pullX()+", "+pointOne.pullY()+") has r = "+pointOne.pullR());
System.out.printf("Theta = %.2f in radians and %.2f in degrees\n\n", pointOne.pullT(), pointOne.pullTD()); 

System.out.print("Enter translation of point (1) in X: ");
Double dx = in.nextDouble();
System.out.print("Enter translation of point (1) in Y: ");
Double dy = in.nextDouble();
pointOne.createFinalValue(dx,dy);
System.out.printf("The translated point (1) at (%.2f, %.2f)  has r = %.2f\n",pointOne.pullX(),pointOne.pullY(),pointOne.pullR() );
System.out.printf("Theta = %.2f in radians and %.2f in degrees\n\n", pointOne.pullT(), pointOne.pullTD());

System.out.print("Enter a new X coordinate for point (2): ");
Double pointtwoX = in.nextDouble();
System.out.print("Enter a new Y coordinate for point (2): ");
Double pointtwoY = in.nextDouble();
Plane pointTwo = new Plane(pointtwoX, pointtwoY);
System.out.printf("The distance between point (1) and point (2) is %.2f units", pointOne.distanceFind(pointTwo));
}
}  

/*
To test this program, translate the intial point to (5,3) and the r should equal 5.84 and theta 30.96. To further test, setting
the second point to (7,1) would result in a r of 7.07 and a distance between the points of 2.83. When testing the program with 
these pre-calculated values, the program returns the correct values.
*/