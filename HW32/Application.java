package HW32;
//Ryan Jukes
//3-9-25
//AT Java AO2

import javax.swing.JFrame;

public class Application extends JFrame {
    public static void main(String[] args) {
        Application app = new Application("Demo");
        app.setVisible(true);
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

    private final int FRAME_HEIGHT = 400;
    private final int FRAME_WIDTH = 400;

    public Application (String title) {
        int borderWidth = 0;
        int borderLength = 0;

        OS os = checkOS();
        switch (os) {
            case WIN:
                borderWidth = 7;
                borderLength = 30;
                break;
            case MAC:
                borderWidth = 0;
                borderLength = 28;
                break;
            case LINUX:
                break;
            case OTHER:
                break;
        }

       Board board = new Board();
       this.add(board);
       int height2 = (int) board.getPreferredSize().getHeight() + (borderLength+borderWidth);
       int width2 = (int) board.getPreferredSize().getWidth() + (2*borderWidth);
       this.setSize(width2, height2);

       this.setTitle(title);
       this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);

    }

}
