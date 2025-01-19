import javax.swing.*;
import java.awt.*;
import java.util.Map;

//Done.

public class PursePanel extends JPanel
{
public Purse purse;
public JLabel purseDisplay;
public int value;

public PursePanel()
{
    purse = new Purse();
    purseDisplay = new JLabel();

    this.setPreferredSize(new Dimension(500, 500));
    this.add(purseDisplay);
}

public void updatePurse(Purse newPurse)
{
    this.purse= newPurse;
    //Similar to repaint in Kotlin
    repaint();
}

//Forgot this originally if you use super must also use @Override
@Override
public void paintComponent(Graphics g)
{
    //Same super as from Kotlin. Overrides the method from JPanel
    super.paintComponent(g);
    String text = "";

    for(Denomination key : purse.getCash().keySet())
     {
        value= purse.getCash().get(key);
        text = text+ key.name() + ": " + value + "\n";
     }
    purseDisplay.setText(text);
}
}
