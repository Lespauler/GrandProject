
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Screen{

    JFrame mainWindow;
    static Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

    JLabel mainTitle;
    JPanel mainPanel;
    JPanel inputPanel;



    public Screen(){
        
        mainWindow=new JFrame("EXAMPLE BANK");
        mainWindow.setVisible(true);
        mainWindow.setSize(d);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }

   public void toggleMainPanel(){
        
        //Main panel
        
        mainPanel=new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(57,17,165));
        
        //Title on the main panel

        mainTitle=new JLabel("Welcome. Please insert your account name and your password");
        mainTitle.setBounds(700, 50, 600,50);
        mainTitle.setFont(new Font("Serif",Font.BOLD,16));
        mainTitle.setForeground(Color.white);
        
        //Secondary Panle inside the main Panel

        inputPanel=new JPanel();
        inputPanel.setBackground(new Color(57,17,165));
        inputPanel.setBounds(700, 300, 600, 400);

        //Adding everything together

        mainPanel.add(inputPanel);
        mainPanel.add(mainTitle);
        mainWindow.add(mainPanel);
        

    }
}