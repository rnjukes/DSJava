//Ryan Jukes
//10-23-24
//AT 05

import java.util.Scanner;
class Light {
    int lightDim = 0; 
    boolean Position = false;
    public void downPosition() {

        if (Position == true) {
            lightDim = lightDim-1;
        } else {
            lightDim = lightDim;
        }
    }

    public void upPosition() {
        lightDim = lightDim+1;
        if (lightDim > 10) {
            lightDim = 10;
        } 
    } 
        
    public int seeLight() {
        return lightDim; 
    }

    public boolean seeonoffLight() {
        return Position; 
    }

    public void startLight() {
        Position = true;
        lightDim = 1;
    } 

    public void endLight() {
        Position = false;
        lightDim = 0;
    } 
 public static void main(String[] args) {
    Light dimmableLight = new Light();
    Scanner in = new Scanner(System.in);
    String UserInput = "";
    int loopNumb = 3;
    while (loopNumb == 3) {
        System.out.print("What function would you like to occur? (on, off, dim, brighten, view, quit)");
        UserInput = in.next();
        if (UserInput.compareTo("on") == 0) {
            dimmableLight.startLight();
        } else if (UserInput.compareTo("off") == 0) {
            dimmableLight.endLight();
        } else if (UserInput.compareTo("dim") == 0) {
            dimmableLight.downPosition();
        } else if (UserInput.compareTo("brighten") == 0) {
                dimmableLight.upPosition();
        } else if (UserInput.compareTo("view") == 0) {
        System.out.println("It is "+dimmableLight.seeLight()+" that the light is on. The dim value of the light is "+dimmableLight.seeLight());
        } else if (UserInput.compareTo("quit") == 0) {
        loopNumb=loopNumb+2;
        } else {
            System.out.println("You must enter a valid command");
            loopNumb=loopNumb; 
        }
    } 
 }
}