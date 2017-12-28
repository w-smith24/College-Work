import java.util.*;
public class p2 {
  
  static Scanner kb = new Scanner(System.in);
  public static void main (String[] arg) {
    
    int diameter, height;
    double radius;
    double circumference, areaOfCircle, cylVolume;
    String name;
    
    double PI = 3.1415926;
    System.out.println("Hello there what is your name?");
    name = kb.nextLine();
    System.out.println("Hey " + name + " we're going to do some geometry today aren't you excited?");
    System.out.println("Please tell me the diameter of a cylinder as a whole number");
    diameter = kb.nextInt();
    System.out.println("Thank you now can you tell me the height of the cylinder as a whole number?");
    height = kb.nextInt();
    radius = diameter/2.0;
    System.out.println("The radius is " + radius);
    System.out.println("The diameter is " + diameter);
    System.out.println("The height is " + height);
    circumference = PI * diameter;
    System.out.println("The circumference of the base is " + circumference);
    areaOfCircle = PI * Math.pow(radius,2);
    System.out.println("The area of the base is " + areaOfCircle);
    cylVolume = areaOfCircle * height;
    System.out.println("The volume of the cylinder is " + cylVolume);
    System.out.println("Wasn't that fun?");
  }
}
  