public class Person implements Measurable
{
 private String name;
 private int birthYear;


/**
  Constructor method
*/
 public Person()
 {
   name = "";
   birthYear = 0;
 }


 /** Constructor with parameters
 @param name the name of the person
 @param birthYear the birth year of the person */
 public Person(String name, int birthYear)
 {
   this.name = name;
   this.birthYear = birthYear;
 }

 /**
   Sets the name for the person
   @param chosenName the name given to the person
 */
 public void setName(String chosenName)
 {
   name = chosenName;
 }

 /**
   Sets the birthYear for the person
   @param chosenYear the year the person was born
 */
 public void setYear(int chosenYear)
 {
   birthYear = chosenYear;
 }

 /* *Retrieves the year of the Person */
 public int getYear()
 {
   return birthYear;
 }

 /* *Retrieves the year of the Person */
 public double getMeasure()
 {
   return birthYear;
 }

 /** Returns the person's name*/
 public String getName()
 {
   return name;
 }




}
