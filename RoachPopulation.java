public class RoachPopulation
{
  private double roachPop;


  public RoachPopulation(double amount)
  {
      this.roachPop = amount;
  }

  public static void main(String [] args)
  {
      RoachPopulation roach1 = new RoachPopulation(10.0);
      System.out.println(roach1.breed());
      System.out.println(roach1.spray());
      System.out.println("Expected: 18.0");
      System.out.println(roach1.getRoaches());
  }

  public double breed()
  {
    double newPop = this.roachPop * 2;
    return this.roachPop = newPop;
  }

  public double spray()
  {
    double reducedPop = this.roachPop * 0.9;
    return this.roachPop = reducedPop;
  }

  public double getRoaches()
  {
    return this.roachPop;
  }


}
