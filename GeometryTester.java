import java.util.*;
public class GeometryTester
{

  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a value for the height ");
    double h = sc.nextDouble();
    System.out.println("Please enter a value for the radius ");
    double r = sc.nextDouble();
    Cone cone = new Cone();
    Cylinder cylinder = new Cylinder();
    Sphere sphere = new Sphere();
    System.out.println("The volume of a cone is : " + cone.coneVolume(r, h));
    System.out.println("The surface area of a cone is: " + cone.coneSurface(r, h));
    System.out.println("The cylinder volume is : " + cylinder.cylinderVolume(r, h));
    System.out.println("The cylinder surface area is: " + cylinder.cylinderSurface(r, h));
    System.out.println("The sphere volume is: " + sphere.sphereVolume(r));
    System.out.println("The sphere surface area is: " + sphere.sphereSurface(r));
  }




}
