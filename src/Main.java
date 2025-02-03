import javax.swing.*;
import java.awt.*;


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
    public KeyPad keyPad;
    public Display display;
    public AccessIndicator accessIndicator;
    public Main(){

        keyPad = new KeyPad();
        display = new Display();
        accessIndicator = new AccessIndicator();

        add(display.dPanel,BorderLayout.NORTH);
        add(keyPad.kPPanel,BorderLayout.EAST);

        accessIndicator.aIPanel.setPreferredSize(new Dimension(150, 0));
        accessIndicator.aIPanel.setBackground(Color.GREEN);
        add(accessIndicator.aIPanel,BorderLayout.WEST);

        add(new JLabel("SafeDoor"),BorderLayout.CENTER);
        add(new JLabel("Access the safe above!"),BorderLayout.SOUTH);



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
        //g2.setColor(Color.BLACK);
        //keyPadPanel.paint(g2);

//        g2.fillRect(winWidth/2 -(safeWidth/2), winHeight/2-(safeHeight/2), safeWidth, safeHeight);
//        g2.dispose();
    }

    public static  void main(String[]args){new Main();}

}