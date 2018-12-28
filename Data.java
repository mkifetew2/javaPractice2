
public class Data
{
  /** Apart of this code is pre-written and the task is to add another method to it */
  /** This method average is from the book, it's used to compute the average of the measures of the given objects
  @param objects an array of Measurable objects
  @return the average of the measures
  */
  public static double average(Measurable[] objects)
  {

    double sum = 0;
    for (Measurable obj: objects)
    {
      sum = sum + obj.getMeasure();
    }
    if(objects.length > 0)
    {
      return sum / objects.length;
    }
    else
    {
      return 0;
    }

  }

  /** This method is for the given question to calculate the largest item by measure
  @param objects an array of Measurable objects
  @return the largest item in the array */
  public static double max(Measurable [] objects)
  {
    double maxElement = 0;
    for (Measurable obj: objects)
    {
      if(obj.getMeasure() > maxElement)
      {
        maxElement = obj.getMeasure();
      }
    }
    return maxElement;
  }



  /** This method is to determine the average birthYear and oldest person
  @param objects an array of Measurable objects
  @return the average birthYear and oldest person */
  public static double personBirthYear(Measurable [] objects)
  {
    double oldestPersonBirthYear = 2000;
    double averageBirthYear;
    double sum = 0;
    for (Measurable obj: objects)
    {
      sum = obj.getMeasure() + sum;
    }
      averageBirthYear = sum / objects.length;
      System.out.println(averageBirthYear);

    for (Measurable obj: objects)
    {
      if(obj.getMeasure() < oldestPersonBirthYear)
      {
        oldestPersonBirthYear = obj.getMeasure();
      }
    }
    
  }


}
