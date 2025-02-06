import javax.swing.*;
import java.awt.*;

public class Display extends JPanel{
    public JLabel dLabel;

    public Display(){
        add(dLabel = new JLabel(""));
        dLabel.setForeground(Color.WHITE);
        setBackground(Color.DARK_GRAY);

    }
}
