/* Class which represents a cash register */
public class CashRegister
{
 /*Instance variables which represent the necessary stuff for a register */
  private double purchase;
  private double payment;
  private double taxRate;



  public static void main(String [] args)
  {
    CashRegister register = new CashRegister(0.13);
    register.recordPurchase(53.13);
    register.recordPurchase(91.87);
    register.enterPayment(185.00);
    System.out.println("The total of the purchase with tax is:  " + register.getTotalTax(register.purchase));
    System.out.println("You've entered payment of: " + register.payment);
    System.out.println("The change you will recieve is: " + (register.payment - register.getTotalTax(register.purchase)));

  }

  /** Constructor which builds the CashRegister
  @param taxRate is the tax for the register */
  public CashRegister(double taxRate)
  {
    purchase = 0;
    payment = 0;
    this.taxRate = taxRate;
  }

  /** Purchase being made on register
  @param purchase amount of the purchase */
  public void recordPurchase(double addPurchase)
  {
    purchase = purchase + addPurchase;
  }

  /** Tax of the entire purchase
  @param purchase dollar figure before adding tax */
  public double getTotalTax(double purchase)
  {
    double taxablePurchase = (taxRate * purchase) + purchase;
    purchase = taxablePurchase;
    return taxablePurchase;
  }

  /** Payment that's being made towards the purchase
  @param payment dollar amount of the payment */
  public void enterPayment(double payment)
  {
    this.payment = payment;
  }

  /** Change that is recieved in the payment for the purchase */

}
