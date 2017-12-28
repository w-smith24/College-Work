/*Wayne Smith
 *CISS111
 *Card class to make a deck of cards*/

public class Card {
  
  private int suit, faceValue;
  
  private static String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
  private static String[] faceValues  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
  
  public Card(int suit, int faceValue) {
    
    this.suit = suit;
    this.faceValue = faceValue;
    
  } 
  
  @Override
  public String toString() {
    
    return faceValues[faceValue] + " of " + suits[suit];
    
  }
  
}
