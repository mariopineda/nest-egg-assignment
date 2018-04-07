//Nest Egg Project
//07/04/2018
import java.io.*;
import java.util.*;
public class NestEgg
{
	public static void main(String args[])
	{
		Scanner kbReader = new Scanner(System.in);
	
		System.out.println("Nest Egg Calculator");
		System.out.print("Enter your salary: $");
		double salary = kbReader.nextDouble();
		System.out.print("Enter the percentage of funds to put into the retirement fund: ");
		double save = kbReader.nextDouble();
		System.out.print("Enter the annual growth percentage: ");
		double growthRate = kbReader.nextDouble();
		System.out.print("Enter the amount of years you want to save for: ");
		int years = kbReader.nextInt(); 
	}
}
