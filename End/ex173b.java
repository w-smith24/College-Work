/* Wayne Smith
 Exercise 17-3
 This program will let the user give a class name to find the
 get and set Methods.  Test with:
 java.util.Date
 javax.swing.JLabel
 java.lang.reflect.Method
 */


import java.io.*;
import java.lang.reflect.Method;

public class ex173b
{
  public static void main(String[] args) throws IOException
  {
    //String classname;
    Class x;
    BufferedReader br = new
      BufferedReader(new InputStreamReader(System.in));
    
    /* Convert this user input to a command line argument */
    for(int i = 0; i < args.length; i++)
    {
      // System.out.print("Enter a full path class name:  ");
      // classname = br.readLine();
      try
      {
        x = Class.forName(args[i]);
        getm(x);
        System.out.println();
        setm(x);
      }
      catch(Exception ex)
      {
        ex.printStackTrace();
      }
    }
  }
    
    public static void getm(Class cls)
    {
      int i;
      String methodname;
      Class rettype;
      Class[] paramtypes;
      Method[] ma;
      System.out.println("Listing get methods for " + cls);      
      
      /* get all methods for the cls Class, loop through methods and
       print all methods that are get methods - start with get, is
       not a void return, and has no arguments
       */      

      ma = cls.getMethods();

      for(i = 0; i < ma.length; i++)
      {
        methodname = ma[i].getName();
        rettype = ma[i].getReturnType();
        paramtypes = ma[i].getParameterTypes();
        if(methodname.startsWith("get") && !rettype.isInstance(Void.TYPE) && paramtypes.length == 0) 
          System.out.println(ma[i]);
      }      
    }
    
    public static void setm(Class cls)
    {
      int i;
      String methodname;
      Class rettype;
      Class[] paramtypes;
      Method[] ma;
      System.out.println("Listing set methods for " + cls);
      
      /* get all methods for the cls Class, loop through methods and
       print all methods that are set methods - start with set, is
       a void return, and has one argument
       */
      
      ma = cls.getMethods();
            
      for(i = 0; i < ma.length; i++)
      {
        methodname = ma[i].getName();        
        rettype = ma[i].getReturnType();
        paramtypes = ma[i].getParameterTypes();
        if(methodname.startsWith("set") && !rettype.isInstance(Void.TYPE) && paramtypes.length == 1) 
          System.out.println(ma[i]);
      }      
    }
  }