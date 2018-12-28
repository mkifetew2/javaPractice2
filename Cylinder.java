public class Cylinder
{
  private static double radius;
  private static double volume;
  private static double surfaceArea;
  private static double height;

  public Cylinder()
  {
    radius = 0;
    height = 0;
  }

  public static double cylinderVolume(double r, double h)
  {
    volume = Math.PI * (r*r) * h;
    return volume;
  }

  public static double cylinderSurface(double r, double h)
  {
    surfaceArea = (2 * Math.PI * r * h) + (2 * Math.PI * (r*r));
    return surfaceArea;
  }


}
