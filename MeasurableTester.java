public class MeasurableTester
{
  public static void main(String [] args)
  {
    Measurable [] accounts = new Measurable[3];
    accounts[0] = new bankAccount(12345.4);
    accounts[1] = new bankAccount(2423.2);
    accounts[2] = new bankAccount(23.2);

    double maxBalance = Data.max(accounts);
    System.out.println("Max balance:  " + maxBalance);
    System.out.println("Expected: 12345.4");

    Measurable [] people = new Measurable[3];
    people[0] = new Person("Mikias", 1994);
    people[1] = new Person("Alemu", 1995);
    people[2] = new Person("Kobe", 1978);


    System.out.println("Expected average birth year is: 1989");
    double oldestPerson = Data.personBirthYear(people);
    System.out.println("Oldest person birth year is: " + oldestPerson);
    System.out.println("Expected: 1978"); 
  }
}
