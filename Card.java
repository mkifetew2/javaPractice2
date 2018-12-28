import java.util.Scanner;
public class Card
{
  private String value;


  public static void main (String [] args)
  {
    Card card1 = new Card ("5S");
    Card card2 = new Card ("AC");
    System.out.println(card1.getDescription());
    System.out.println(card2.getDescription());
  }

  /** Constructor which assigns card value
  @param value which is card's value */
  public Card(String value)
  {
    this.value = value;
  }

  public String getDescription()
  {
    String cardNum = this.value.substring(0,1);
    String cardSym = this.value.substring(1,2);
    String cardNumVal = " ";
    String cardFaceVal = " ";
    String result;
    switch (cardNum)
    {
      case "2": cardNum.equals("2");
      cardNumVal = "Two of";
      break;

      case "3": cardNum.equals("3");
      cardNumVal = "Three of";
      break;

      case "4": cardNum.equals("4");
      cardNumVal = "Four of";
      break;

      case "5": cardNum.equals("5");
      cardNumVal = "Five of";
      break;

      case "6": cardNum.equals("6");
      cardNumVal = "Six of ";
      break;

      case "7": cardNum.equals("7");
      cardNumVal = "Seven of";
      break;

      case "8": cardNum.equals("8");
      cardNumVal = "Eight of";
      break;

      case "9": cardNum.equals("9");
      cardNumVal = "Nine of";
      break;

      case "10": cardNum.equals("10");
      cardNumVal = "Ten of";
      break;

      case "J": cardNum.equals("J");
      cardNumVal = "Jack of ";
      break;

      case "Q": cardNum.equals("Q");
      cardNumVal = "Queen of";
      break;

      case "K": cardNum.equals("K");
      cardNumVal = "King of";
      break;

      case "A": cardNum.equals("A");
      cardNumVal = "Ace of";
      break;

      default: cardNum = "invalid";
    }


    switch(cardSym)
    {
      case "S": cardSym.equals("S");
      cardFaceVal = " Spades";
      break;

      case "C": cardSym.equals("C");
      cardFaceVal = " Clubs";
      break;

      case "D": cardSym.equals("D");
      cardFaceVal = " Diamonds";
      break;

      case "H": cardSym.equals("H");
      cardFaceVal = " Hearts";
      break;

      default: cardSym = "invalid";
    }

   result = cardNumVal + cardFaceVal;
   return result;

  }


}
