import java.io.*;
import java.util.*;
public class nestEgg {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      double salary, save, growth, inflation, fund = 0;
      System.out.print("How much is your salary? ");
      salary = kbReader.nextDouble();
      System.out.print("What percentage of your salary are you saving? ");
      save = kbReader.nextDouble();
      System.out.print("What is the growth percentage of the retirement fund? ");
      growth = kbReader.nextDouble();
      System.out.print("Do you want your salary to grow with inflation? (Y/N) ");
      char choice = kbReader.next(".").charAt(0);
      if (choice == 'Y' || choice == 'y') {
         
      }
      else {
         
      }
      for (int i = 0; i < 10; i++) {
         fund = fund * (1 + 0.01 * growth) + salary *save * 0.01; //Calculation for determining retirement fund
      }
      System.out.println("By the end of 10 years, your retirement fund will be $" + fund);
   }
}
