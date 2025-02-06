import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    public KeyPad keyPad;
    public Display display;
    public AccessIndicator accessIndicator;
    public JLabel sLabel;
    public JLabel nLabel;

    public Panel(){
        keyPad = new KeyPad();
        display = new Display();
        accessIndicator = new AccessIndicator();

        setBackground(Color.DARK_GRAY);
        setLayout(new BorderLayout());

        add(display,BorderLayout.NORTH);
        add(keyPad.kPPanel,BorderLayout.EAST);
        add(accessIndicator,BorderLayout.WEST);
        add(sLabel = new JLabel("SafeDoor Closed!"),BorderLayout.CENTER);
        sLabel.setForeground(Color.WHITE);
        add(nLabel = new JLabel("Access the safe above!"),BorderLayout.SOUTH);
        nLabel.setForeground(Color.WHITE);

        //Adding ActionListeners to all buttons in keyPad
        keyPad.btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "0");}}

        });
        keyPad.btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "1");}
            }
        });
        keyPad.btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "2");}
            }
        });
        keyPad.btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "3");}}

        });
        keyPad.btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "4");}
            }
        });
        keyPad.btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "5");}
            }
        });
        keyPad.btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "6");}}

        });
        keyPad.btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "7");}
            }
        });
        keyPad.btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "8");}
            }
        });
        keyPad.btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() < 4){display.dLabel.setText(dLabelStr + "9");}}

        });
        //Add ActionListeners to Enter and Clear buttons!
        keyPad.btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {display.dLabel.setText("");}
        });
        keyPad.btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dLabelStr = display.dLabel.getText();
                if(dLabelStr.length() == 4){
                    if(dLabelStr.equals(keyPad.code)){
                        sLabel.setText("Safe Door Opens!");
                        nLabel.setText("Congratulations successfully accessed safe!");
                        accessIndicator.setBackground(Color.GREEN);

                    }
                    else{
                        sLabel.setText("Safe Door Remains Closed!");
                        display.dLabel.setText("");
                        nLabel.setText("Access denied!");
                        accessIndicator.setBackground(Color.RED);
                    }
                }


            }
        });

    }

    public   void update() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        //g2.setColor(Color.BLACK);
//        g2.fillRect(winWidth/2 -(safeWidth/2), winHeight/2-(safeHeight/2), safeWidth, safeHeight);
//        g2.dispose();
    }

}