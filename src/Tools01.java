// JFrame
import javax.swing.*;
import java.awt.*;

public class Tools01 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        ImageIcon icon=new ImageIcon("D:\\Codes\\Java\\Images\\bird.png");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setTitle("Title");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(Color.BLUE);
        //frame.getContentPane().setBackground(new Color(0,0,0,0));
    }
}
