import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public KeyPad kP;
    public Panel(){
        //kP = new KeyPad();
        //add(kP);
    }

    public   void update() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
//        g2.fillRect(winWidth/2 -(safeWidth/2), winHeight/2-(safeHeight/2), safeWidth, safeHeight);
//        g2.dispose();
    }

}