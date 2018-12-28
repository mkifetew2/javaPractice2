import static java.lang.Math.*;
import java.util.Scanner;

public class ConfidenceVal
{
      public static double p1;
      public static double p2;

      public static void main (String [] args)
      {
        ConfidenceVal cf = new ConfidenceVal();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a z value: ");
        double z = sc.nextDouble();
        System.out.println("Enter a f value: ");
        double f = sc.nextDouble();
        System.out.println("Enter a n value: ");
        double n = sc.nextDouble();
        cf.getConfidenceVal(z, f, n);
        System.out.println("The value of p1 is: " + cf.getP1() + "  and p2 is : " + cf.getP2());
      }


      public void getConfidenceVal(double z, double f, double n)
      {
        p1 = (f + ((z*z)/(2 * n)) - (z * (Math.sqrt((f/n) - ((f*f)/n) +((z*z)/(4 * n * n))))))/(1+((z * z)/n));
        p2 = (f + ((z*z)/(2 * n)) + (z * (Math.sqrt((f/n) - ((f*f)/n) +((z*z)/(4 * n * n))))))/(1+((z * z)/n));
      }

      public double getP1()
      {
        return p1;

      }

      public double getP2()
      {
        return p2;
      }

}
