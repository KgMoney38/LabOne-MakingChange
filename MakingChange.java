import javax.swing.*;

public class MakingChange
{
public static void main(String[] args)
{
    JFrame frame= new JFrame("Making Change");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setVisible(true);
    frame.add(new RegisterPanel());
}
}
