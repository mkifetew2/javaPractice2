import java.util.Scanner;
/**
  A class that describes the effects of an earthquake
  */

public class Earthquake
{
  private double richter;

  public static void main(String []args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a magnitude on the Richter Scale: ");
    double magnitude = in.nextDouble();
    Earthquake quake = new Earthquake(magnitude);
    System.out.println(quake.getDescription());
  }

  /** Constructs an Earthquake object.
  @param magnitude the magnitude on the Richter scale
  */
  public Earthquake(double magnitude)
  {
    richter = magnitude;
  }


   /**
      Gets a description of the effect of the earthquake.
      @return the description of the effect
   */
   public String getDescription()
   {
     String r;
     if(richter >= 8.0)
      r = "Most structures fall";
     else if(richter >= 7.0)
      r = "Many buildings fall";
     else if(richter >= 6.0)
      r = "Many buildings take damage, some fall";
     else if(richter >= 4.5)
      r = "Damage to poorly constructed buildings";
     else if(richter >= 3.5)
      r = "Felt by many people, no destruction";
     else if (richter >= 0)
      r = "Generally not felt by people";
     else
      r = "Negative values are not allowed";
    return r;
   }

}
