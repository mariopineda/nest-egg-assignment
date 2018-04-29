import java.io.*;
import java.util.*;
public class nestEgg {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      String defVal = "   Your input is not sensible or invalid. A default value has been assigned.";
      int defArray = {51000,15,3,0,35};
      double salary, save, growth, inflation, fund = 0;
      int years;
      System.out.print("How much is your salary? ");
      salary = kbReader.nextDouble();
      if (salary <= 0) {
         salary = defArray[0];
         System.out.println(defVal);
      }
      System.out.print("What percentage of your salary are you saving? ");
      save = kbReader.nextDouble();
      if (save <= 0 || save >= 100) {
         save = defArray[1];
         System.out.println(defVal);
      }
      System.out.print("What is the growth percentage of the retirement fund? ");
      growth = kbReader.nextDouble();
      if (growth <= 0 || growth >= 100) {
         growth = defArray[2];
         System.out.println(defVal);
      }
      System.out.print("Do you want your salary to grow with inflation? (Y/N) ");
      char choice = kbReader.next(".").charAt(0);
      if (choice == 'Y' || choice == 'y') {
         inflation = 0.022;
         System.out.println("   Your salary will grow with inflation.");
      }
      else {
         inflation = defArray[3];
         System.out.println("   Your salary will not grow with inflation.");
      }
      System.out.print("How long until retirement? ");
      years = kbReader.nextInt();
      if (years <= 0) {
         years = defArray[4];
         System.out.println(defVal);
      }
      for (int i = 0; i < years; i++) {
         fund = fund * (1 + 0.01 * growth) + salary *save * 0.01; //Calculation for determining retirement fund
         salary = salary * (1 + inflation);
      }
      System.out.printf("By the end of " + years + " years, your retirement fund will be $" + "%.2f.\n", fund);
   }
}
