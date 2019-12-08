import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc
{
    private double num1 = 0.0;
    private double num2 = 0.0;
    private char mathOperator;

    private void getOperator(String btnText)
    {
        mathOperator = btnText.charAt(0);
        num1 = num1 + Double.parseDouble(screen.getText());
        screen.setText("");

    }
    private calc()
    {
        button0.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               String btn0Text = screen.getText() + button0.getText();
               screen.setText(btn0Text);
            }
        });
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text = screen.getText() + button1.getText();
                screen.setText(btn1Text);
            }
        });
        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2Text = screen.getText() + button2.getText();
                screen.setText(btn2Text);
            }
        });
        button3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btn3Text = screen.getText() + button3.getText();
                screen.setText(btn3Text);
            }
        });
        button4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btn4Text = screen.getText() + button4.getText();
                screen.setText(btn4Text);
            }
        });
        button5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btn5Text = screen.getText() + button5.getText();
                screen.setText(btn5Text);
            }
        });
        button6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btn6Txt = screen.getText() + button6.getText();
                screen.setText(btn6Txt);
            }
        });
        button7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btn7Txt = screen.getText() + button7.getText();
                screen.setText(btn7Txt);
            }
        });
        button8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btn8Txt = screen.getText() + button8.getText();
                screen.setText(btn8Txt);
            }
        });
        button9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btn9Txt = screen.getText() + button9.getText();
                screen.setText(btn9Txt);
            }
        });
        buttonEqual.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                switch (mathOperator)
                {
                    case '+':
                        num2 = num1 + Double.parseDouble(screen.getText());
                        break;
                    case '-':
                        num2 = num1 - Double.parseDouble(screen.getText());
                        break;
                    case '*':
                        num2 = num1 * Double.parseDouble(screen.getText());
                        break;
                    case '/':
                        num2 = num1 / Double.parseDouble(screen.getText());
                        break;
                    case '#':
                        num2 = num1 % Double.parseDouble(screen.getText());
                        break;
                    case '^':
                        num2 = Math.pow(num1, Double.parseDouble(screen.getText()));
                        break;
                }
                screen.setText(Double.toString(num2));
            }
        });
        buttonC.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                num2 = 0.0;
                num1 = 0.0;
                screen.setText("");
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if screen is empty
                if (screen.getText().equals(""))
                {
                    screen.setText("0.");
                }
                else if (screen.getText().contains("."))
                {
                    buttonDot.setEnabled(false);
                }
                else
                {
                    String btnDot = screen.getText() + buttonDot.getText();
                    screen.setText(btnDot);
                }
                buttonDot.setEnabled(true);
            }
        });
        buttonPlus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btnText = buttonPlus.getText();
                getOperator(btnText);
            }
        });
        buttonMinus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btnText = buttonMinus.getText();
                getOperator(btnText);
            }
        });
        buttonMulti.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btnText = buttonMulti.getText();
                getOperator(btnText);
            }
        });
        buttonDivide.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btnText = buttonDivide.getText();
                getOperator(btnText);
            }
        });
        buttonRemainder.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btnText = buttonRemainder.getText();
                getOperator(btnText);
            }
        });
        buttonPower.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String btnText = buttonPower.getText();
                getOperator(btnText);
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
    private JButton buttonDot;
}