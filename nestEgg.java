import java.io.*;
import java.util.*;
public class nestEgg {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      String defVal = "   Your input is not sensible or invalid. A default value has been assigned.";
      int defArray = {51000,15,3,0,35}; //Array containing default values of all variables
      double salary, save, growth, inflation, fund = 0; //Declaring all variables
      int years;
      try { //Tries to run section of program and catches exceptions (ex. InputMismatch)
         System.out.print("How much is your salary? ");
         salary = kbReader.nextDouble();
         if (salary <= 0) {
            salary = defArray[0];
            System.out.println(defVal); //Prints the default statement from line 6
         }
      }
      catch (Exception e) { //If there is an exception then it assigns default values instead of halting program
         salary = defArray[0];
         System.out.println(defVal);
         kbReader.next();
      }
      try { //Assigning value to save
         System.out.print("What percentage of your salary are you saving? ");
         save = kbReader.nextDouble();
         if (save <= 0 || save >= 100) {
            save = defArray[1];
            System.out.println(defVal);
         }
      }
      catch (Exception e) {
         save = defArray[1];
         System.out.println(defVal);
         kbReader.next();
      }
      try { //Assigning value to growth rate (interest) of fund
         System.out.print("What is the growth percentage of the retirement fund? ");
         growth = kbReader.nextDouble();
         if (growth <= 0 || growth >= 100) {
            growth = defArray[2];
            System.out.println(defVal);
         }
      }
      catch (Exception e) {
         growth = defArray[2];
         System.out.println(defVal);
         kbReader.next();
      }
      try { //Determining whether inflation should be used
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
      catch (Exception e) {
         inflation = defArray[3];
         System.out.println(defVal);
         System.out.println("   Your salary will not grow with inflation.");
         kbReader.next();
      }
      try { //Assigning value to number of years until retirement
         System.out.print("How long until retirement? ");
         years = kbReader.nextInt();
         if (years <= 0) {
            years = defArray[4];
            System.out.println(defVal);
         }
      catch (Exception e) {
         years = defArray[4];
         System.out.println(defVal);
      }
      for (int i = 1; i <= years; i++) { //Iterative loop that runs for number of years until retirement
         fund = fund * (1 + 0.01 * growth) + salary *save * 0.01; //Calculation for determining retirement fund
         salary = salary * (1 + inflation); //Calculation for determining salary with inflation
      }
      System.out.printf("By the end of " + years + " years, your retirement fund will be $" + "%.2f.\n", fund);
   }
}
