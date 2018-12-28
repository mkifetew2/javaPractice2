/**
   A bank account has a balance that can be changed by deposits and withdrawals.
*/
public class bankAccount implements Measurable
{
  private double balance;
  private double penalty = 1.25;

  /**
     Constructs a bank account with a zero balance.
  */
  public bankAccount()
  {
    balance = 0;
  }

  /**
     Adds interest to the bank bankAccount
     @param rate percent of the interest
  */
  public void addInterest(double rate)
  {
    balance = balance + (balance * (rate/100));
  }

  /**
     Constructs a bank account with a given balance.
     @param initialBalance the initial balance.
  */

  public bankAccount(double initialBalance)
  {
    balance = initialBalance;
  }

  /**
     Deposits money into the bank account.
     @param amount the amount to deposit.
  */

  public void deposit(double amount)
  {
    balance = balance + amount;
  }

  /**
     Withdraws money from the bank account.
     @param amount the amount to withdraw.
  */

  public void withdraw(double amount)
  {
    if (balance >= amount)
      balance = balance - amount;
    else
       balance = balance - penalty;
  }

  /**
     Gets the current balance of the bank account.
     @return the current balance
  */

  public double getBalance()
  {
    return balance;
  }

  public double getMeasure()
  {
    return balance;
  }
}
