public class PersonTester
{
  public static void main(String []args)
  {
    Student3 s1 = new Student3();
    s1.setName("Mikias Kifetew");
    s1.setYear(1994);
    s1.setMajor("Computer Science");
    System.out.println("The student we are discussing is: " + s1.getName() + ", his birth year is: " + s1.getYear() + " and his major is: " + s1.getMajor()); 
  }
}
