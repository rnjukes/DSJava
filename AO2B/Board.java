package AO2B;
//Ryan Jukes
//3-9-25
//AT Java AO2

import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;


    public class Board extends JPanel {
    private final int WIDTH = 720;
    private final int HEIGHT = 720;
    private BufferedImage image;
    private int x = 0;
    private int y = 0;
    private double angle = 0;
    private final int IMG_SIZE = 100; 
    private final int SPEED = 1;
    
    public Board() {
       setBackground(Color.WHITE);
       setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        try {
            File imageFile = new File("AO2/Pictures/Andy.png");
            image = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        timeSecs = new Timer();
        timeSecs.scheduleAtFixedRate(new ScheduledUpdate(), 0, TP);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphic = (Graphics2D) g;

        if (image != null) {
            
            AffineTransform AT = new AffineTransform();
            AT.translate((x + IMG_SIZE / 2), (y + IMG_SIZE / 2)); 
            AT.rotate(Math.toRadians(angle));  
            AT.translate((-IMG_SIZE / 2), (-IMG_SIZE / 2)); 

            graphic.drawImage(image, AT, this);
        } else {
            graphic.setColor(Color.BLUE);
            graphic.drawString("Unable to load image!", 25, 25);
        }
   }
   private Timer timeSecs;
   private final int DELAY_SEC = 100;
   private final int TP = 25;
   private int xS = 3;

   private class ScheduledUpdate extends TimerTask {
       public void run() {
            x += xS;
            if (x > WIDTH) {
                x = 0;
            }
            angle += 1; 
            if (angle >= 360) {
                angle = 0; 
            }
            repaint();
       }
       
   }
}
