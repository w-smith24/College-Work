/*Wayne Smith
 *CISS111
 *Word class for program 5 will store the word and how many times it's in the file*/

public class Word
{
  private String word;
  private int wordCount = 0;
  //Constructor that takes a string as an arguement
  public Word(String word)
  {
    this.word = word;
    wordCount++;
  }
  //Method to get the word 
  public String getWord()
  {
    return word;
  }
  //Method to increment the wordCount everytime the word is found in the file  
  public void incrementWord()
  {
    wordCount++;
  }
  
  @Override
  public String toString()
  {
    return "\nWord: " + word + "\nNumber of times word appeared in file: " + wordCount +"\n";  
  }
}