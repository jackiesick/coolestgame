import javax.swing.*;
import java.awt.*;

public class GUI extends App 
{

    public static void main(String[] args) 
    {
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(1000, 1000, 1000, 1000 ));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Timer Game");
        frame.pack();
        frame.setVisible(true);
    }
    
}
