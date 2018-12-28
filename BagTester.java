public class BagTester
{
  public static void main(String [] args)
  {
    Bag bg = new Bag();
    bg.add("Basketball");
    bg.add("Football");
    bg.add("Basketball");
    bg.add("Basketball");
    System.out.println("The amount of basketball in this bag are: " + bg.count("Basketball"));
    System.out.println("Expected: 3"); 
  }
}
