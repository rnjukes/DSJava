package PMS.Code;
/*  Ryan Jukes
    AT Java
    4-5-25    
*/

import javax.swing.JFrame;

public class Application extends JFrame {
    private final int FRAME_WIDTH = 3840;
    private final int FRAME_HEIGHT = 2160;

    public Application(String title) {
        int width = 0;
        int height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                width = 7;
                height = 30;
                break;
            case MAC:
                width = 0;
                height = 28;
                break;
            case LINUX:

                break;
            case OTHER:
                break;
        }

        this.setTitle(title);
        Board board = new Board();
        this.add(board);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        int application_height = (int) board.getPreferredSize().getHeight() + height + width;
        int application_width = (int) board.getPreferredSize().getWidth() + 2 * width;
        this.setSize(application_width, application_height);
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
} 
