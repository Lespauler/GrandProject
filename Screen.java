import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;


public class Screen implements ActionListener{

    JFrame mainWindow;
    static Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    JLabel mainTitle;
    JPanel mainPanel;
    JPanel inputPanel;
    JPanel newClientPanel;

    JLabel accountNameLabel;
    JLabel passwordLabel;
    JLabel registerNameLabel;
    JLabel registerPasswordLabel;
    JLabel confirmPasswordLabel;
    
    JTextField usernameField;
    JTextField passwordField;

    JButton loginButton, newClientButton, submitNewClientButton;

    JTextField registerName;
    JTextField registerPassword;
    JTextField confirmPassword;

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

        //login or new Client buttons

        loginButton=new JButton("Login");
        loginButton.setBounds(210, 280, 100,20);
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(this);

        newClientButton=new JButton("Register");
        newClientButton.setBounds(330,280, 100, 20);
        newClientButton.setFocusPainted(false);
        newClientButton.addActionListener(this);

        //add everything togetherter

        inputPanel.add(accountNameLabel);
        inputPanel.add(passwordLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordField);
        inputPanel.add(loginButton);
        inputPanel.add(newClientButton);
        
        mainPanel.add(inputPanel);
        mainPanel.add(mainTitle);
        mainWindow.add(mainPanel);
        mainWindow.pack();

    }

    //register panel

    public void newClientPanel(){

        newClientPanel=new JPanel();
        newClientPanel.setBackground(new Color(57,17,165));         //panel
        newClientPanel.setLayout(null);

        registerNameLabel=new JLabel("Username");                   //labels
        registerNameLabel.setForeground(Color.white);              
        registerNameLabel.setBounds(815,350,80,18);

        registerPasswordLabel=new JLabel("Password");
        registerPasswordLabel.setForeground(Color.white);
        registerPasswordLabel.setBounds(815,390,80,18);

        confirmPasswordLabel=new JLabel("Confirm Password");
        confirmPasswordLabel.setForeground(Color.white);
        confirmPasswordLabel.setBounds(758,430,140,18);

        registerName=new JTextField();                              //textfields
        registerName.setBounds(900,350,140,20);

        registerPassword=new JTextField();
        registerPassword.setBounds(900,390,140,20);

        confirmPassword=new JTextField();
        confirmPassword.setBounds(900,430,140,20);

        submitNewClientButton=new JButton("Register");              //buttons
        submitNewClientButton.setFocusPainted(false);
        submitNewClientButton.addActionListener(this);
        submitNewClientButton.setBounds(900,490,100,20);

        newClientPanel.add(confirmPasswordLabel);                   //adding everything together
        newClientPanel.add(registerPasswordLabel);                            
        newClientPanel.add(registerNameLabel);                      
        newClientPanel.add(confirmPassword);
        newClientPanel.add(registerName);
        newClientPanel.add(registerPassword); 
        newClientPanel.add(submitNewClientButton);  

        mainWindow.add(newClientPanel);
        mainWindow.pack();
        mainWindow.repaint();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==newClientButton){
            mainWindow.remove(mainPanel);
            mainWindow.remove(inputPanel);
            this.newClientPanel();

        }
    
    }
}
