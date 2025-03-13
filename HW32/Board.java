package HW32;
//Ryan Jukes
//3-11-25
//AT Java 


import javax.swing.JPanel;
import HW32.sc;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements KeyListener, MouseListener {
     public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("TEST");
            myApp.setVisible(true);
        });
    }

    public void keyPressed(KeyEvent e) {
        blip();
        if (e.getKeyCode() == 32) {
            blop();
            xDot = (WIDTHa / 2) - (WIDTH / 2);
            yDot = (HEIGHTa / 2) - (WIDTH / 2);
            repaint();
            blip();
        }
    }

    public void mousePressed(MouseEvent e) {
        xDot = e.getX() - (WIDTH / 2);
        yDot = e.getY() - (WIDTH / 2);
        repaint();
        blip();
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    private final int WIDTHa = 400;
    private final int HEIGHTa = 400;
    private final int WIDTH = 20;
    private int xDot = (WIDTHa / 2) - (WIDTH / 2);
    private int yDot = (HEIGHTa / 2) - (WIDTH / 2);
    sc blip = new sc("Files/blip.wav");
    sc blop = new sc("Files/blop.wav");

    private void blop() {
        blop.open();
        blop.play();
        blop.setLoop(false);
    }

    private void blip() {
        blip.open();
        blip.play();
        blip.setLoop(false);
    }

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(WIDTHa, HEIGHTa));
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphic = (Graphics2D) g;
        graphic.setColor(Color.MAGENTA);

        graphic.setColor(Color.MAGENTA);
        graphic.fillOval(xDot, yDot, WIDTH, WIDTH);
    }
}