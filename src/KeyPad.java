import javax.swing.*;
import java.awt.*;


public class KeyPad{
    final String code = "4590";
    String inputCode = "4590";
    public KeyHandler kH;
    public JPanel kPPanel;
    public JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
            btnEnter,btnClear;

    public KeyPad(){
        kH = new KeyHandler();
        kPPanel = new JPanel();
        kPPanel.setLayout(new GridLayout(4, 3, 10, 5));

        //Initialize keyPad buttons!
        btn0 = new JButton("0");btn1 = new JButton("1");
        btn2 = new JButton("2");btn3 = new JButton("3");
        btn4 = new JButton("4");btn5 = new JButton("5");
        btn6 = new JButton("6");btn7 = new JButton("7");
        btn8 = new JButton("8");btn9 = new JButton("9");
        btnClear = new JButton("Clear");btnEnter = new JButton("Enter");

        //Add keyPad buttons into keyPadPanel
        kPPanel.add(btn1);kPPanel.add(btn2);kPPanel.add(btn3);
        kPPanel.add(btn4);kPPanel.add(btn5);kPPanel.add(btn6);
        kPPanel.add(btn7);kPPanel.add(btn8);kPPanel.add(btn9);
        kPPanel.add(btnClear);kPPanel.add(btn0);kPPanel.add(btnEnter);

        //kPPanel.setBackground(Color.CYAN);
    }

    public boolean isValid(){
        if(code.equals(inputCode)){return true;}
        return false;
    }

    public String setICode(String inputCode){
        if(inputCode.length() < 5){
            this.inputCode = inputCode;
            return inputCode;
        }
        return inputCode;
    }





}