
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Screen{

    JFrame mainWindow;
    static Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    JLabel mainTitle;
    JPanel mainPanel;
    JPanel inputPanel;

    JLabel accountNameLabel;
    JLabel passwordLabel;

    JTextField usernameField;
    JTextField passwordField;
    
    

    public Screen(){
        
        mainWindow=new JFrame("EXAMPLE BANK");
        mainWindow.setVisible(true);
        mainWindow.setSize(d);
        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        
        //Secondary Panel inside the main Panel

        inputPanel=new JPanel();
        inputPanel.setBackground(new Color(57,17,165));
        inputPanel.setBounds(700, 300, 600, 400);
        inputPanel.setLayout(null);
        
        //Labels for userName and password

        accountNameLabel=new JLabel("Username");
        accountNameLabel.setForeground(Color.white);
        accountNameLabel.setBounds(100,100,80,18);
        passwordLabel=new JLabel("Password");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setBounds(102,140,85,18);

        //textfields

        usernameField=new JTextField();
        usernameField.setBounds(220,100,200,22);
        usernameField.setText("Username");

        passwordField=new JTextField();
        passwordField.setBounds(220,140,200,22);
        passwordField.setText("Password");
        
        //add everything together

        inputPanel.add(accountNameLabel);
        inputPanel.add(passwordLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordField);
        mainPanel.add(inputPanel);
        mainPanel.add(mainTitle);
        mainWindow.add(mainPanel);
        mainWindow.pack();

    }
}