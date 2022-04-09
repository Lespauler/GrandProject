
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;


public class Screen{

    JFrame mainWindow;
    static Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    private static final double WIDTH = d.getWidth();
    private static final double HEIGHT = d.getHeight();
    JLabel mainTitle;
    JPanel mainPanel;



    public Screen(){
        
        mainWindow=new JFrame("AT");
        mainWindow.setVisible(true);
        mainWindow.setSize(d);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel=new JPanel();
        mainPanel.setLayout(null);

        mainTitle=new JLabel("Welcome. Please insert your account name and your password");
        mainTitle.setBounds(700, 50, 600,50);
        mainTitle.setFont(new Font("Serif",Font.BOLD,16));

        mainPanel.add(mainTitle);
        mainWindow.add(mainPanel);
        
    
    }

   

}