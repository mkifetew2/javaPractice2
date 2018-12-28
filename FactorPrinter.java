import java.util.Scanner;

public class FactorPrinter
{
  public static int numberToFactor;
  public static void main(String [] args)
  {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number for me to factor: ");
    numberToFactor = sc.nextInt();
    FactorPrinter fgm = new FactorPrinter(numberToFactor);
    fgm.hasMoreFactors(numberToFactor);

  }


  public FactorPrinter(int numberToFactor)
  {
    this.numberToFactor = numberToFactor;
  }

  public void hasMoreFactors(int numberToFactor)
  {

    for (int i = 2; i <= numberToFactor/2; i++)
    {
      if(numberToFactor % i == 0)
      {
        nextFactor(i);
      }
    }
  }

  public int nextFactor(int i)
  {
    System.out.println(i);
    return i;
  }

}
