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
    private JButton a2Button;
    private JButton a5Button;
    private JTextField screen;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonMulti;
    private JButton button8;
    private JButton buttonDivide;
    private JButton buttonRemainder;
    private JButton ButtonPower;
    private JButton ButtonC;
    private JButton a9Button;
    private JButton a1Button;
    private JButton a6Button;
    private JButton button0;
    private JButton buttonEqual;
}
