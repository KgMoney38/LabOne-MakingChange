import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel
{
    private Register register;
    private JTextField input;
    private JButton makeChangeButton;
    private PursePanel changePanel;

    public RegisterPanel()
    {
        register = new Register();
        this.setPreferredSize(new Dimension(500, 500));

        JPanel inputPanel = new JPanel();
        input = new JTextField(10);
       makeChangeButton = new JButton("Make Change");

        inputPanel.add(new JLabel("Enter Amount: "));
        inputPanel.add(input);
        inputPanel.add(makeChangeButton);

        changePanel = new PursePanel();
        this.add(inputPanel);
        this.add(changePanel);

        makeChangeButton.addActionListener(new changeListener());
    }

    private class changeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double amount = Double.parseDouble(input.getText());
            Purse purse = register.makeChange(amount);
            changePanel.updatePurse(purse);
        }
    }
}
