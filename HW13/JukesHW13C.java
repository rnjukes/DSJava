//Ryan Jukes
//11-15-24
//HW 17 Part C

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class JukesHW13C {
    public static void draw(Graphics g) {
    final int CHANGE = 1000;
    for (int i = 0; i <= CHANGE; i++) {
        double thet = i*CHANGE;
        double rad = Math.cos(2*thet);
        double xcord = 150*rad*Math.cos(thet);
        double ycord = 150*rad*Math.sin(thet);
        int plotxcord = (int) (200+xcord);
        int plotycord = (int) (200+ycord);

        g.setColor(Color.BLUE);
        g.fillRect(plotxcord, plotycord, 1,1);
    }
       
    }



    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }
    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }   
    public static void main(String[] args) { 
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                break;
            case OTHER:
                break;
        }
        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };
        frame.add(component);
        frame.setVisible(true);
        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }

}