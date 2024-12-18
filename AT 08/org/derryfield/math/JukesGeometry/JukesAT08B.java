package org.derryfield.math.JukesGeometry;
//Ryan Jukes
//12-18-24
//AT08 Part B Demo

import java.util.Scanner;

import org.derryfield.math.Geometry;

public class JukesAT08B {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter sphere radius: ");
    double radius = in.nextDouble();
    double volume = Geometry.calcVolSphere(radius);
    double surfA = Geometry.calcSurfSphere(radius);

    System.out.printf("The radius of the sphere given is: %.2f%n" , radius);
    System.out.printf("Volume:        %.2f%n" , volume);
    System.out.printf("Surface Area:  %.2f%n" , surfA);
    }
}


