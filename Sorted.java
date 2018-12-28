import java.util.Scanner;
/** Class which organizes float values given by user*/
public class Sorted
{

  public static void main(String [] args)
  {
    float first;
    float second;
    float third;

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter three numbers: ");

    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();

    if(a < b && a < c && c > b)
     {
       first = a;
       second = b;
       third = c;
       System.out.println("The inputs in sorted order are: " + first + " " + second + " " + third);
     }

    else if (b < a && b < c && c > a)
    {
      first = b;
      second = a;
      third = c;
      System.out.println("The inputs in sorted order are: " + first + " " + second + " " + third);
    }

    else if (c < a && c < b && a > b)
    {
      first = c;
      second = b;
      third = a;
      System.out.println("The inputs in sorted order are: " + first + " " + second + " " + third);
    }

    else if (b > a && b > c && c > a)
    {
        first = a;
        second = c;
        third = b;
        System.out.println("The inputs in sorted order are: " + first + " " + second + " " + third);
    }

    else if (a > c && a > b && c > b)
    {
      first = b;
      second = c;
      third = a;
      System.out.println("The inputs in sorted order are: " + first + " " + second + " " + third);
    }

    else
    {
      first = c;
      second = a;
      third = b;
      System.out.println("The inputs in sorted order are: " + first + " " + second + " " + third);
    }
  }
}
