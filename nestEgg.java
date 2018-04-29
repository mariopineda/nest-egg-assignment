import java.io.*;
import java.util.*;
public class nestEgg {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      double salary, save, growth, fund = 0;
      System.out.print("How much is your salary? ");
      salary = kbReader.nextDouble();
      System.out.print("What percentage of your salary are you saving? ");
      save = kbReader.nextDouble();
      System.out.print("What is the growth percentage of the retirement fund? ");
      growth = kbReader.nextDouble();
   }
}
