package code;
import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame {
    public GUI() {
        configFrame();
    }
    
    private void configFrame() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void initComponents() {
        
    }
}
