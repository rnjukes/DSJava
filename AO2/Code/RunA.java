package AO2.Code;
//Ryan Jukes
//3-9-25
//AT Java AO2
import javax.swing.JFrame;
public class RunA {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        Board panel = new Board();
        
        frame.add(panel);
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}