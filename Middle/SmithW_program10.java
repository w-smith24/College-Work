/* Wayne Smith
 * CISS111
 * Program 10 will create a deck of cards and deal 5 cards to a player then display them*/ 


import java.util.*;

public class SmithW_program10 {
  
  public static void main (String[] args) {
    
    Deck myDeck = new Deck();
    CardPlayer player = new CardPlayer();
    
    myDeck.shuffle();
    
    for(int i = 0; i < 5; i++)
      player.getCard();
    
    System.out.println(player.showCards());
  }
}