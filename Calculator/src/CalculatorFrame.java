import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame(){
        super("My Calculator");
        // Panel p1 for the numbers
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3, 10, 10));
        p1.setBackground(Color.gray);

        for (int i =1; i <= 9; i ++){
            JButton button = new JButton (Integer.toString(i));
            //set the color for the buttons
            button.setBackground(Color.WHITE);
            // if you use MAC
            button.setOpaque(true);
            button.setBorderPainted(false);

            //set the color and chenge the font
            button.setForeground(Color.black);

            button.setFont(new Font("Arial", Font.BOLD, 20));
            p1.add(button);
        }

        JButton zeroButton = new JButton("0");
        p1.add(zeroButton);
        JButton dotButton = new JButton(".");
        p1.add (dotButton);

        // set color for "zero" and "."
        zeroButton.setBackground(Color.white);
        zeroButton.setForeground(Color.black);
        zeroButton.setOpaque(true);
        zeroButton.setBorderPainted(false);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 20));

        dotButton.setBackground(Color.white);
        dotButton.setForeground(Color.black);
        dotButton.setOpaque(true);
        dotButton.setBorderPainted(false);
        dotButton.setFont(new Font("Arial", Font.BOLD, 20));


        //panel p2 for the operations
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setLayout(new GridLayout(4, 1, 2, 2));

        JButton plusButton = new JButton("+");
        p2.add(plusButton);
        JButton minusButton = new JButton("-");
        p2.add(minusButton);
        JButton clearButton = new JButton("Clear");
        p2.add(clearButton);
        JButton equalsButton=new JButton("=");
        p2.add(equalsButton);

        // set color for "+", "-" and "Clear"
        plusButton.setBackground(Color.orange);
        plusButton.setOpaque(true);
        plusButton.setBorderPainted(false);
        plusButton.setForeground(Color.black);
        plusButton.setFont(new Font("Arial", Font.BOLD, 20));

        minusButton.setBackground(Color.orange);
        minusButton.setOpaque(true);
        minusButton.setBorderPainted(false);
        minusButton.setForeground(Color.black);
        minusButton.setFont(new Font("Arial", Font.BOLD, 20));

        clearButton.setBackground(Color.orange);
        clearButton.setOpaque(true);
        clearButton.setBorderPainted(false);
        clearButton.setForeground(Color.black);
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));

        equalsButton.setBackground(Color.orange);
        equalsButton.setOpaque(true);
        equalsButton.setBorderPainted(false);
        equalsButton.setForeground(Color.black);
        equalsButton.setFont(new Font("Arial", Font.BOLD, 20));

        //panel p3 that combines p1 and p2
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));
        p3.add(p1);
        p3.add(p2);

        // in the content frame (Which has by default a Border layout) we combined p3 and the textfiled
        JTextField txtField = new JTextField();
        txtField.setBackground(Color.white);
        //clearButton.setOpaque(true);
        //clearButton.setBorderPainted(false);
        txtField.setForeground(Color.blue);
        txtField.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(p3, BorderLayout.CENTER);
        this.add(txtField, BorderLayout.NORTH);



    }




}
