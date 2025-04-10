package PMS.Code;

/*  Ryan Jukes
    AT Java
    4-8-25    
*/

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ball {
    public enum STATUS {IDLE, AIR, FIRING}
    private STATUS status; 
    private double xPos;
    private double yPos;
    private double Vx;
    private double Vy;
    private final double gravity = 9.8;
    private final double ground; 
    private final int r = 10;
    private final double timeScale = 7.0;

    public Ball(double ground) {
        this.ground = ground;
        this.status = STATUS.IDLE;
    }

    public void draw(Graphics2D graphics) {
        if (status == STATUS.AIR) {
            graphics.setColor(Color.RED);
            graphics.fill(new Ellipse2D.Double(xPos - r, yPos - r, 2 * r, 2 * r));
        } else if (status == STATUS.FIRING) {
            graphics.setColor(Color.ORANGE);
            graphics.fillOval((int)xPos - 15, (int)yPos - 15, 30, 30); 
        }
    }

    public void updateBall() {
        if (status != STATUS.AIR) return;

        Vy += gravity / timeScale;

        yPos += Vy / timeScale;
        xPos += Vx / timeScale;

        if (yPos >= ground) {
            yPos = ground;
            status = STATUS.FIRING;
            Vx = 0;
            Vy = 0;
        }
    }

    public void launch(double xi, double yi, double Vxi, double Vyi) {
        if (status == STATUS.AIR) return;

        xPos = xi;
        yPos = yi;
        Vx = Vxi;
        Vy = -Vyi;  
        status = STATUS.AIR;
    }

    public void resetSystem() {
        status = STATUS.IDLE;
    }

    public STATUS getStatus() {
        return status;
    }
}