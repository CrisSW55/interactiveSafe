import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame{
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double monitorWidth = screenSize.getWidth();
    double monitorHeight = screenSize.getHeight();
    double centerWinX = monitorWidth *.5 - monitorWidth *.25;
    double centerWinY = monitorHeight * .5 - monitorHeight *.25;

    int winWidth;
    int winHeight;
    int safeWidth = 500;
    int safeHeight = 300;


    public Panel panel;
    public Main(){
        panel = new Panel();
        add(panel);

        //Set window title,dimensions, location, and visibility
        setTitle("Interactive Safe!");
        setSize((int)monitorWidth/2, (int)monitorHeight/2);
        winWidth = getWidth();
        winHeight = getHeight();
        setLocation((int)centerWinX,(int)centerWinY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public   void update() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
    }

    public static  void main(String[]args){new Main();}

}