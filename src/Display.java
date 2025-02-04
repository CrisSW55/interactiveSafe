import javax.swing.*;
import java.awt.*;

public class Display {
    public JPanel dPanel;
    public JLabel dLabel;

    public Display(){
        dPanel = new JPanel();
        dPanel.add(dLabel = new JLabel("Display!"));
    }
}
