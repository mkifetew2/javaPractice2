public class DigitExtractor
{
  private int assignedNum;

  public static void main(String [] args)
  {
    DigitExtractor myExtractor = new DigitExtractor(24513);
    System.out.println(myExtractor.nextDigit());
    System.out.println(myExtractor.nextDigit());
    System.out.println(myExtractor.nextDigit());
    System.out.println(myExtractor.nextDigit());
    System.out.println(myExtractor.nextDigit());
  }

  /** Constructs a digit extractor that gets the digits of an integer in reverse order.
  @param anInteger the integer to brak up into digits
  */
  public DigitExtractor(int anInteger)
  {
    this.assignedNum = anInteger;
  }

  /** Returns the next digit to be extracted.
  @return the next digit
  */
  public int nextDigit()
  {
    int exponentNum = 1; 
    int nextDigit = this.assignedNum % (int) Math.pow(10, exponentNum);
    this.assignedNum = this.assignedNum / 10;
    return nextDigit;
  }
}
