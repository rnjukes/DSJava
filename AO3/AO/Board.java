package AO3.AO;
//Ryan Jukes
//3-11-25
//AT Java 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import AO3.AO.sc;

public class Board extends JPanel {
    public static void main(String[] args) {
        JFrame z = new JFrame("TEST");
        Board board = new Board();
        
        z.add(board);
        z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        z.pack();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }

    private final int WIDTH = 720;
    private final int HEIGHT = 720;
    private BufferedImage img;
    private int x = 0;
    private int y = 0;
    private double angle = 0;
    private final int IMAGE_SIZE = 100; 
    private final int SPEED = 2;
    private sc sitarMusic;
    private sc owSound;
    private int ySpeed;
  
    public Board() {
       setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        try {
            File imageFile = new File("AO3/Files/Andy.png");
            img = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.err.println("Unable to load image: " + e.getMessage());
        }
        
        sitarMusic = new sc("AO3/Files/sitar.wav");
        sitarMusic.open();
        sitarMusic.setLoop(true);
        sitarMusic.isLoop();
        sitarMusic.play();
        
        owSound = new sc("AO3/Files/ow.wav");
        owSound.open();
        
        Random rand = new Random();
        x = WIDTH / 2 - IMAGE_SIZE / 2;
        y = HEIGHT / 2 - IMAGE_SIZE / 2;
        xSpeed = rand.nextInt(5) + 1;
        ySpeed = rand.nextInt(5) + 1;
        
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(), 0, INT);
    }
    

   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;

        if (img != null) {

            AffineTransform affineTransform = new AffineTransform();

            affineTransform.translate(x + IMAGE_SIZE / 2, y + IMAGE_SIZE / 2);  
            affineTransform.rotate(Math.toRadians(angle)); 
            affineTransform.translate(-IMAGE_SIZE / 2, -IMAGE_SIZE / 2);  

            graphics.drawImage(img, affineTransform, this);
        } else {
            graphics.setColor(Color.RED);
            graphics.drawString("Unable to load image!", 25, 25);
        }
   }
private Timer timer;
   private final int I_DEL = 100;
   private final int INT = 25;
   private int xSpeed = 2;

   private class ScheduledUpdate extends TimerTask {
        public void run() {
            x += xSpeed;
            y += ySpeed;
            
            if (x <= 0 || x + IMAGE_SIZE >= WIDTH) {
                xSpeed = -xSpeed;
                owSound.play();
            }
            
            if (y <= 0 || y + IMAGE_SIZE >= HEIGHT) {
                ySpeed = -ySpeed;
                owSound.play();
            }
            
            angle += 1;
            if (angle >= 360) {
                angle = 0;
            }
            repaint();
        }
    }
}