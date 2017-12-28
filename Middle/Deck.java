/*Wayne Smith
 *CISS111
 *Deck class to creat a deck of Cards*/

import java.util.*;

public class Deck {
  
  private static ArrayList<Card> cards;
  private static int cardsDealt = -1;
  
  public Deck() {
    
    cards = new ArrayList<Card>();    
    
    for(int suit = 0; suit <= 3; suit++) {
      
      for(int face = 0; face <= 12; face++) {
        
        cards.add(new Card(suit, face));
      }
    }
  }
  
  public void shuffle() {
    
    Collections.shuffle(cards);
    
  }
  
  public static Card deal() {
    
    cardsDealt++;
    return cards.get(cardsDealt);
    
  }
    
}


