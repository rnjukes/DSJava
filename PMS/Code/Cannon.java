package PMS.Code;
/*  Ryan Jukes
    AT Java
    4-7-25    
*/

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import HW32.sc;

public class Cannon {
    public Cannon() {
        try {
            File cannFile = new File("PMS/Files/sm_cannon.png");
            cImage = ImageIO.read(cannFile);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

        posX = 60 - xAng;
        posY = 720 - 60 - yAng;
        angle = -45;
        Vi = 0;  
    }

    public void BANG() {
         try {
            sc cannonSound = new sc("PMS/Files/cannon.wav");
            cannonSound.open();
            cannonSound.play();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void CRANK() {
         try {
            sc cannonSound = new sc("PMS/Files/wheel.wav");
            cannonSound.open();
            cannonSound.play();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void cannonDown(double factor) {
        angle = (int) (angle + factor);
        CRANK();
        if (angle < -90) {
            angle = -90;
        } else if (angle > 0) {
            angle = 0;
        }
    }

    public void cannonUp(double factor) {
    angle = (int) (angle - factor);
        CRANK();
        if (angle > 0) {
            angle = 0;
        } else if (angle < -90) {
            angle = -90;
        }
    }

    public void FIRE() {
        BANG();
    }

    public double getX() {
        return posX;
    }

    public double getY() {
        return posY;
    }

    public void setX(int newVal) {
        posX = newVal;
    }

    public void setY(int newVal) {
        posY = newVal;
    }

    public void setVi(int newVal) {
        Vi = newVal; 
    }

    public double getAngle() {
        return angle; 
    }

    public double getVi() {
        return Vi;
    }

    public void spawnCannon(Graphics2D graphics) {
        final int r2 = 10;
        AffineTransform AT = new AffineTransform();
        
        AT.translate(posX, posY);
        AT.rotate(Math.toRadians(angle), xAng, yAng);
        graphics.drawImage(cImage, AT, null);

        int baseX = 60;              
        int baseY = 720 - 25;        

        int[] xPoints = {baseX-35, baseX + 35, baseX};
        int[] yPoints = {baseY, baseY, baseY - 35};
        graphics.setColor(Color.BLACK);
        graphics.fillPolygon(xPoints, yPoints, 3);
        
        int r22 = 5;
        int circleX = baseX - r22;
        int circleY = (baseY - 35) - r22;
        graphics.setColor(Color.BLUE);
        graphics.fillOval(circleX, circleY, r22 * 2, r22 * 2);
        
    }

    BufferedImage cImage;
    private final int a = 1280;
    private final int b = 720;
    final static int c = 100;

    final int cHeight = 51;
    final int cWidth = 124;
    final int xAng = 15;
    final int yAng = (cHeight/2);

    private int posX;
    private int posY;
    private int angle; 
    private int Vi;
    
   } 
