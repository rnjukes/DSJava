package AO2B;
//Ryan Jukes
//3-9-25
//AT Java AO2
import javax.swing.JFrame;
import AO2B.Board;

public class RunB {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        Board panel = new Board();
        
        frame.add(panel);
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}