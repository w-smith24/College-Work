/*Wayne Smith
 *CISS111
 *CardPlayer class to create a hand of cards for a player*/

import java.util.*;

public class CardPlayer {
  
  private Card currentCard;
  
  private ArrayList<Card> hand = new ArrayList<Card>();
  
  public void getCard() {
    
    currentCard = Deck.deal();
    
    hand.add(currentCard);
    
  }
  
  public String showCards() {
    
    return hand.toString();
  
  }
}