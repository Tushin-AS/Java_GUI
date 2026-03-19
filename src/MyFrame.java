import javax.swing.*;
import java.awt.*;

public class MyFrame  extends JFrame {
    MyFrame()
    {
        ImageIcon icon=new ImageIcon("D:\\Codes\\Java\\Images\\bird.png");

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setResizable(false);
        this.setTitle("Title");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }
}
