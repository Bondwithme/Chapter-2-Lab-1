
// ************************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ************************************************
import java.util.Random;
 
public class RollingDice {
  public static void main(String[] args) {
      Random generator = new Random();
      int roll1; 
      int roll2;
      int totalRoll;
      roll1 = generator.nextInt(6)+1;
      roll2 = generator.nextInt(6)+1;
      totalRoll = (roll1 + roll2);
      System.out.println("Roll 1 is " + roll1 + ", Roll 2 is " + roll2);
      System.out.println("Total roll is "+ totalRoll);
      
    }
}
