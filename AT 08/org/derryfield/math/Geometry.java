package org.derryfield.math;

public class Geometry {
    public static double calcVolSphere(double r) {
        return (4.0/3.0) * Math.PI * (r*r*r);
    } 

    public static double calcSurfSphere(double r) {
        return 4.0 * Math.PI * (r*r); 
    }


}
