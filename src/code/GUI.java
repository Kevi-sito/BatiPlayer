package code;
import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame {
    public JPanel mainPanel;
    public CardLayout cardLayout;
    public GUI() {
        configFrame();
        initComponents();
    }
    
    private void configFrame() {
        setSize(800, 600);
        setTitle("BatiPlayer");
        setLocationRelativeTo(null);     
        setDefaultCloseOperation(EXIT_ON_CLOSE);         
    }
    
    private void initComponents() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        getContentPane().add(mainPanel);
        
    }
    
    private void menu() {
        
    }
}
