
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Screen{

    JFrame mainWindow;
    static Dimension d=Toolkit.getDefaultToolkit().getScreenSize();


    public Screen(){
        
        mainWindow=new JFrame("AT");
        mainWindow.setVisible(true);
        mainWindow.setSize(d);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   

}