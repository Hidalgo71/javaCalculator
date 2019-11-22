import javax.swing.*;

public class calc {
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
    private JButton ButtonPower;
    private JButton ButtonC;
    private JButton button9;
    private JButton button1;
    private JButton button6;
}
