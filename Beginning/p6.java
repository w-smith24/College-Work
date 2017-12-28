import java.util.*;

public class p6 {
  
  public static int numChar(String s) {
    int count=0;
    count = s.length();
    return count;
  }
  
  public static int numDigit(String s) {
    int count=0;
    int i;
    char ch;
    for(i=0;i<s.length();i++)
    {
      ch=s.charAt(i);
      if(Character.isDigit(ch))
        count++;    
    }
    return count;
  }  
  
  public static int numWhite(String s) {
    int count=0;
    int i;
    char ch;
    for(i=0;i<s.length();i++){
      ch=s.charAt(i);
      if(Character.isWhitespace(ch))
        count++;    
    }
    return count;
  } 
  
  public static int numVowel(String s){
    int count=0;
    int i;
    char ch;
    for(i=0;i<s.length();i++){
      if((s.charAt(i) == 'a') || 
         (s.charAt(i) == 'e') ||
         (s.charAt(i) == 'i') || 
         (s.charAt(i) == 'o') ||
         (s.charAt(i) == 'u') ||
         (s.charAt(i) == 'A') ||
         (s.charAt(i) == 'E') ||
         (s.charAt(i) == 'I') ||
         (s.charAt(i) == 'O') ||
         (s.charAt(i) == 'U'))
        count++;
    }
    return count;
  }
  
  
  public static int numLetter(String s) {
    int count=0;
    int i;
    char ch;
    for(i=0;i<s.length();i++)
    {
      ch=s.charAt(i);
      if(Character.isLetter(ch))
        count++;    
    }
    return count;
  }  
  
  static Scanner kb = new Scanner(System.in);
  
  public static void main (String[] args) {
    
    String inputLine;
    
    System.out.print("Enter a string for character classification: (EOF to end): ");
    
    while (kb.hasNext()){
      
      inputLine = kb.nextLine();
      
      System.out.println("inputLine = " + '"' + inputLine + '"');
      
      System.out.printf("inputLine is %d characters long and contains the following: %n",numChar(inputLine));
      
      System.out.printf("%d Digits.%n",numDigit(inputLine));
      
      System.out.printf("%d Whitespace characters.%n",numWhite(inputLine));
      
      System.out.printf("%d Letters.%n",numLetter(inputLine));
      
      System.out.printf("%d Vowels.%n",numVowel(inputLine));
      
      System.out.print("Enter a string for character classification: (EOF to end): ");
    }
    
  }
  
}