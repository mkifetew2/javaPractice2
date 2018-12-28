public class Cone
{
  private static double radius;
  private static double volume;
  private static double surfaceArea;
  private static double height;

  public Cone()
  {
    radius = 0;
    height = 0;
  }

  public static double coneVolume(double r, double h)
  {
    volume = Math.PI * (r * r) * (h/3);
    return volume;
  }

  public static double coneSurface(double r, double h)
  {
    surfaceArea =  Math.PI * r * ((r * Math.sqrt((h*h) + (r*r)) ));
    return surfaceArea;
  }

}
