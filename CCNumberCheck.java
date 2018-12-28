import java.util.Scanner;

/**  Program to protect aganist transcription errors */

public class CCNumberCheck
{
  private static int ccNum;
  private static int rightMostSum;
  private static int leftofTwoSum;
  private static int addResult;


  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a 8 digit number: ");
    ccNum = sc.nextInt();
    CCNumberCheck visa = new CCNumberCheck(ccNum);
    visa.rightMost(ccNum);
    visa.doubleSplit(ccNum);
    visa.getAddResult(rightMostSum, leftofTwoSum);
    visa.validity(addResult);

  }

/** Constructor method
@param ccNum the credit card number the user inputs */
  public CCNumberCheck(int ccNum)
  {
    this.ccNum = ccNum;
  }

/**  Gets the sum of every other digit that is right most
    @param ccNum the credit card number the user inputs  */
  public int rightMost(int ccNum)
  {
    rightMostSum = 0;
    while (ccNum > 0)
    {
      rightMostSum += ccNum % 10;
      ccNum = ccNum/100;
    }
  System.out.println(rightMostSum);
  return rightMostSum;

  }

/** Doubles each digit that was not included in the method above,
splits them and then adds them
@param ccNum the credit card number the user inputs */
  public int doubleSplit(int ccNum)
  {
    leftofTwoSum = 0;
    int a = (ccNum % 100)/10;
    int b = (ccNum % 10000)/1000;
    int c = (ccNum % 1000000)/100000;
    int d = (ccNum % 100000000)/10000000;


    int a2 = a * 2;
    int b2 = b * 2;
    int c2 = c * 2;
    int d2 = d * 2;


    if (a2 >= 10)
    {
      leftofTwoSum += (a2 % 10) + (a2 / 10);
    }
    else
    {
      leftofTwoSum += (a2 % 10);
    }


    if (b2 >= 10)
    {
      leftofTwoSum += (b2 % 10) + (b2 / 10);
    }
    else
    {
      leftofTwoSum += (b2 % 10);
    }

    if (c2 >= 10)
    {
      leftofTwoSum += (c2 % 10) + (c2 / 10);
    }
    else
    {
      leftofTwoSum += (c2 % 10);
    }

    if (d2 >= 10)
    {
      leftofTwoSum += (d2 % 10) + (d2 / 10);
    }
    else
    {
      leftofTwoSum += (d2 % 10);
    }


  System.out.println(leftofTwoSum);
  return leftofTwoSum;

  }

/** Method to add the two values calculated from previous  */
  public int getAddResult(int rightMostSum, int leftofTwoSum)
  {
    addResult = rightMostSum + leftofTwoSum;
    System.out.println(addResult);
    return addResult;
  }


  public boolean validity(int addResult)
  {

    if (addResult % 10 != 0)
    {
        System.out.println("This is not valid");
        return false;
    }
    else
    {
        System.out.println("This is valid");
        return true;
    }
  }


}
