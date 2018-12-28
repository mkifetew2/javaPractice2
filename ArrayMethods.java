import java.util.Arrays;
import java.util.Random;

public class ArrayMethods
{
  private int[] values;
  static int ARRAY_LENGTH = 7;
  static int [] numArray = new int[ARRAY_LENGTH];



  //Main method
  public static void main(String [] args)
  {
    Random rand = new Random();
    for(int i = 0; i < ARRAY_LENGTH; i++)
    {
      numArray[i] = rand.nextInt(50);
    }

    ArrayMethods array =  new ArrayMethods(numArray);
    System.out.println("The original array is: " + Arrays.toString(numArray));
    array.swapFirstAndLast();
    array.shiftRight();
    array.replaceEvenElems();
    array.shrinkArr();
    array.moveEvenFront();
    array.returnSecondLargest();
  }

  //Constructor method
  public ArrayMethods(int [] initialValues)
  {
    values = initialValues;
  }


  //This method will swap the first element in the array and the last element in the array
  public void swapFirstAndLast()
  {
    int [] tempArr = new int[7];
    tempArr[0] = numArray[numArray.length - 1];
    tempArr[numArray.length - 1] = numArray[0];

    for (int i = 1; i < 6; i++)
    {
      tempArr[i] = numArray[i];
    }
    System.out.println("After the swap of the last and first element: " + Arrays.toString(tempArr));
  }

  //This method will move every element 1 position to the right, except for the last element which goes to the front
  public void shiftRight()
  {
    int [] tempArr2 = new int[7];
    tempArr2[0] = numArray[6];
    for (int i = 1; i < numArray.length; i++)
    {
      tempArr2[i] = numArray[i - 1];
    }
    System.out.println("After moving every element 1 position to the right: " + Arrays.toString(tempArr2));
  }

  //This method will change every even element to 0
  public void replaceEvenElems()
  {
    int [] tempArr3 = new int[7];

    for (int i = 0; i < numArray.length; i++)
    {
      if(numArray[i] % 2 == 0)
      {
        tempArr3[i] = 0;
      }
      else
      {
        tempArr3[i] = numArray[i];
      }
    }
    System.out.println("After the array has replaced even elements with 0 it becomes: " + Arrays.toString(tempArr3));
  }

  //Will remove element in the middle of the array
  public void shrinkArr()
  {
    int tempArrLength = ARRAY_LENGTH;
    int [] tempArr4 = new int[ARRAY_LENGTH];
    tempArr4[3] = numArray[ARRAY_LENGTH - 1];
    for(int i = 6; i > 3; i--)
    {
      tempArr4[i] = numArray[i-1];
    }
    tempArrLength--;
    System.out.println("After removing the middle element in the array it becomes: " + Arrays.toString(tempArr4));
  }

  //This method will move even elements to the front of the array
  public void moveEvenFront()
  {
    int [] tempArr5 = new int[ARRAY_LENGTH];
    int backEnd = ARRAY_LENGTH - 1;
    for (int i = 0; i < ARRAY_LENGTH; i++)
    {
      if(numArray[i] % 2 == 0)
      {
        tempArr5[i] = numArray[i];
      }
      if(numArray[i] % 2 == 1)
      {
        tempArr5[backEnd] = numArray[i];
        backEnd--;
      }
    }
    System.out.println("This is what the array will look like after sorting the even elements to the front: " + Arrays.toString(tempArr5));

  }


  //This should return the second biggest element in the array
  public void returnSecondLargest()
  {
    int secondLargest, largestYet;
    largestYet = secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < ARRAY_LENGTH; i++)
    {
      if (numArray[i] > largestYet)
      {
        secondLargest = largestYet;
        largestYet = numArray[i];
      }
      else if (numArray[i] > secondLargest && numArray[i] != largestYet)
      {
        secondLargest = numArray[i];
      }
    }
    System.out.println("The second largest number in the array is: " + secondLargest);
  }




}
