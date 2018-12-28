import java.util.Random;
import java.util.Arrays;

public class Four0Arrays
{
  public static void main(String [] args)
  {
    int[] values = new int[10];
    Random rand = new Random();


    //Assigning random numbers and printing them
    System.out.print("The values for the array: ");
    for (int i = 0; i < values.length; i++)
    {
      values[i] = rand.nextInt(50) + 1;
      System.out.print(values[i] + " ");
    }
    System.out.println(" ");


    //This section will print out the even index elements
    System.out.print("Every element at an even index: ");
    for (int i = 0; i < values.length; i = i+2)
    {
      System.out.print(values[i] + " ");
    }
    System.out.println(" ");


    //This section will print every even element
    System.out.print("Every even element: ");
    for (int i = 0; i < values.length; i++)
    {
      if (values[i] % 2 == 0)
      {
        System.out.print(values[i] + " ");
      }
    }
    System.out.println(" ");


    //All elements in reverse order
    System.out.print("All elements in reverse order: ");
    for(int i = values.length - 1; i >= 0; i--)
    {
      System.out.print(values[i] + " ");
    }
      System.out.println(" ");


    //Only the first and last element
    System.out.print("Only the first and last element: ");
    System.out.print(values[0] + " ");
    System.out.print(values[9] + " ");
    System.out.println(" ");


  }
}
