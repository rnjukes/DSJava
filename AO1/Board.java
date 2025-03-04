package AO1;
//Ryan Jukes
//3-3-25
//AT Java AO1

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public class Board extends JPanel {
    private final int WIDTH = 350;
    private final int HEIGHT = 350;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    private final int SIDE = 150;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int x_t = WIDTH / 2 - SIDE / 2;
        int y_t = HEIGHT / 2 - SIDE / 2;

        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x_t, y_t);
        affineTransform.rotate(Math.toRadians(22.5), SIDE/2.0, SIDE/2.0);
        g2d.setColor(Color.BLUE);
        g2d.drawString("Hello world!",50,50);

        Rectangle rect = new Rectangle(0, 0, SIDE, SIDE);
        Shape tShape = affineTransform.createTransformedShape(rect);
        g2d.setColor(Color.MAGENTA);
        g2d.fill(tShape);
    }
}
