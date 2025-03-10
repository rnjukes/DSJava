package AO2.Code;
//Ryan Jukes
//3-9-25
//AT Java AO2

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
    private final int WIDTH = 350;
    private final int HEIGHT = 350;
    private BufferedImage image;

    public Board() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        try {
            File imageF = new File("AO2/Pictures/MarkD.jpg"); 
            image = ImageIO.read(imageF);
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        if (image != null) {
            int imgWidth = WIDTH / 4; 
            int imgHeight = HEIGHT / 4;
            int x = WIDTH - imgWidth;  
            int y = HEIGHT - imgHeight;

            g2d.drawImage(image, x, y, imgWidth, imgHeight, this);
        } else {
            g2d.setColor(Color.RED);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }
}
