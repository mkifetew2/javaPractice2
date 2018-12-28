public class Sphere
{

  private static double radius;
  private static double volume;
  private static double surfaceArea;



  public Sphere()
  {
      radius = 0;
  }

  public static double sphereVolume(double r)
  {
     volume = (4/3) * Math.PI * (r*r*r);
     return volume;
  }

  public static double sphereSurface(double r)
  {
    surfaceArea =  4 * Math.PI * (r*r);
    return surfaceArea;
  }

}
