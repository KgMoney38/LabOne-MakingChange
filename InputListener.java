import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class InputListener implements ActionListener
{
    private Register register;
    private PursePanel pursePanel;
    private JTextField input;

    public InputListener(Register register, PursePanel pursePanel, JTextField input)
    {
        this.register = register;
        this.pursePanel = pursePanel;
        this.input = input;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        double amount = Double.parseDouble(input.getText());
        if(amount<0.01)
        {
            pursePanel.updatePurse(new Purse());
        }
        else
        {
            Purse purse = register.makeChange(amount);
            pursePanel.updatePurse(purse);
        }
    }
}
