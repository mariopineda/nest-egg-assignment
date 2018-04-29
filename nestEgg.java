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
      for (int i = 0; i < 10; i++) {
         
      }
      System.out.println("By the end of 10 years, your retirement fund will be $" + fund);
   }
}
