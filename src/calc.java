import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc {
    public calc() {
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               String button0Text = screen.getText() + button0.getText();
               screen.setText(button0Text);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = screen.getText() + button1.getText();
                screen.setText(button1Text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calc");
        frame.setContentPane(new calc().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel calculator;
    private JButton button2;
    private JButton button5;
    private JTextField screen;
    private JButton button3;
    private JButton button4;
    private JButton button7;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonMulti;
    private JButton button8;
    private JButton buttonDivide;
    private JButton buttonRemainder;
    private JButton buttonPower;
    private JButton buttonC;
    private JButton button9;
    private JButton button1;
    private JButton button6;
    private JButton button0;
    private JButton buttonEqual;
}
