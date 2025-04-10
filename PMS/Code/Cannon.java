package PMS.Code;

/*  Ryan Jukes
    AT Java
    4-7-25    
*/

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import HW32.sc;

public class Cannon {
    private BufferedImage cImage;
    private final int cHeight = 51;
    private final int cWidth = 124;
    private final int xAng = 15;
    private final int yAng = cHeight / 2;

    private int posX;
    private int posY;
    private double angle; 
    private double Vi;

    private Ball ball;

    public Cannon() {
        try {
            File cannFile = new File("PMS/Files/sm_cannon.png");
            cImage = ImageIO.read(cannFile);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        angle = -45;
        Vi = 95; 
        posX = 60 - xAng;
        posY = 720 - 60 - yAng;
    }

    public void setBall(Ball b) {
        this.ball = b;
    }

    public void BANG() {
        try {
            sc cannonSound = new sc("PMS/Files/cannon.wav");
            cannonSound.open();
            cannonSound.play();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void CRANK() {
        try {
            sc wheelSound = new sc("PMS/Files/wheel.wav");
            wheelSound.open();
            wheelSound.play();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void cannonDown(double factor) {
        angle += factor;
        CRANK();
        if (angle < -90) angle = -90;
        if (angle > 0) angle = 0;
    }

    public void cannonUp(double factor) {
        angle -= factor;
        CRANK();
        if (angle > 0) angle = 0;
        if (angle < -90) angle = -90;
    }

    public void FIRE() {
        BANG();
        if (ball.getStatus() == Ball.STATUS.AIR) return;

        double radians = Math.toRadians(angle);
        double Vxi = Vi * Math.cos(radians);
        double Vyi = -Vi * Math.sin(radians); 

        ball.launch(posX + cWidth / 2.0, posY - yAng, Vxi, Vyi);
    }

    public void spawnCannon(Graphics2D graphics) {
        AffineTransform AT = new AffineTransform();
        AT.translate(posX, posY);
        AT.rotate(Math.toRadians(angle), xAng, yAng);
        graphics.drawImage(cImage, AT, null);

        int baseX = 60;
        int baseY = 720 - 25;
        int[] xPoints = {baseX - 35, baseX + 35, baseX};
        int[] yPoints = {baseY, baseY, baseY - 35};

        graphics.setColor(Color.BLACK);
        graphics.fillPolygon(xPoints, yPoints, 3);

        int r = 5;
        graphics.setColor(Color.BLUE);
        graphics.fillOval(baseX - r, baseY - 35 - r, r * 2, r * 2);
    }

    public double getX() { return posX; }
    public double getY() { return posY; }
    public void setX(int newVal) { posX = newVal; }
    public void setY(int newVal) { posY = newVal; }
    public double getAngle() { return angle; }
    public double getVi() { return Vi; }
    public void setVi(int newVal) { Vi = newVal; }
}
