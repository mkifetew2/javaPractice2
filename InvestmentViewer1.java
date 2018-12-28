import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InvestmentViewer1
{
  private static final int FRAME_WIDTH = 300;
  private static final int FRAME_HEIGHT = 350;

  public static void main(String [] args)
  {
    JFrame frame = new JFrame();
    JButton button = new JButton("Add Interest"); 
    frame.add(button);

    ActionListener listener = new AddInterestListener();
    button.addActionListener(listener);

    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}


}
