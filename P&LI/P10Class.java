public class P10Class
{
  public static int SEQ_NUM;
  public static int BIN_NUM;
  
  public static int seq_search(int[] data, int key)
  {
    boolean found = false;
    int i = 0;
    
    SEQ_NUM = 0;
    
    while ( !found && (i < data.length) )
    {
      if ( data[i] == key )
        found = true;
      else
        i++;
      
      SEQ_NUM++;
    }
    
    if ( found )
      return i;
    else
      return -1;
  }
  
  public static int bin_search(int[] data, int key)
  {
    boolean found = false;
    int midpoint = 0, first = 0, last;
    
    BIN_NUM = 0;
    last = data.length - 1;
    
    while ( ( first <= last ) && !found )
    {
      midpoint = (first + last) / 2;
      if ( data[midpoint] == key )
        found = true;
      else if ( data[midpoint] > key )
        last = midpoint - 1;
      else
        first = midpoint + 1;
      
      BIN_NUM++;
    }
    
    if ( found )
      return midpoint;
    else
      return -1;
  }
}