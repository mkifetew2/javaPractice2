import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class AddInterestListener implements ActionListener
{
  private bankAccount account;
  private static final int INTEREST_RATE = 10;
  private static final int INITIAL_BALANCE = 1000;

  public AddInterestListener()
  {
    account = new bankAccount(INITIAL_BALANCE);
  }

  public void actionPerformed(ActionEvent event)
  {
    double interest = account.getBalance() * INTEREST_RATE/ 100;
    account.deposit(interest);
    System.out.println("balance:   " + account.getBalance());
  }
}
