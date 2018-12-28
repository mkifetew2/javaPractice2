import static java.lang.Math.*;
import java.util.Scanner;
/** Class which does the quadratic equation */

public class QuadraticEquation
{
  private double a;
  private double b;
  private double c;


  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter an 'a' value: ");
    double a = sc.nextDouble();
    System.out.print("Please enter a 'b' value: ");
    double b = sc.nextDouble();
    System.out.print("Please enter a 'c' value: ");
    double c = sc.nextDouble();
    QuadraticEquation qe = new QuadraticEquation(a, b, c);
    qe.hasSolutions();
    System.out.println("The first soultion is " + qe.getSolution1(a,b,c));
    System.out.println("The second soultion is "+ qe.getSolution2(a,b,c));
  }

  /** Constructor method */
  public QuadraticEquation(double a, double b, double c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }
/** Method which check if or not the parabola has solutions */
  public boolean hasSolutions()
  {
    double discriminant = pow(b,2) - (4 * a * c);
    if (discriminant < 0)
    {
        System.out.println("The discriminant is negative, so there is no real solutions");
        return false;
    }
    else
    {
      System.out.println("The discriminant is positive it is: " + discriminant);
      return true;
    }
  }

  /** Method to idenitfy 1/2 solutions to parabola
  @param a, b, c are the values for the parabola
  */
  public double getSolution1(double a, double b, double c)
  {
    double solution1 = ((-1 * b) - sqrt(pow(b, 2) - 4 * a * c)) / (2*a);
    return solution1;
  }

 /** Method to idenitfy 1/2 solutions to parabola
 @param a, b, c are the values for the parabola
 */
  public double getSolution2(double a, double b, double c)
  {
    double solution2 = ((-1 * b) + sqrt(pow(b, 2) - 4 * a * c)) / (2*a);
    return solution2;
  }

}
