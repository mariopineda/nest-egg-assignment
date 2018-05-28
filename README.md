# java-project-2-nest-egg
In this assignment you will model a retirement fund with some simple equations. 

We are going to start with a simple model of saving for retirement. Many employers will contribute the equivalent of 5% of your salary to a retirement fund, and then will match any contribution that you add, dollar for dollar, up to an additional 5%. Thus you can salt away up to 15% of your salary into a retirement account (10% of which comes as a bonus from your employer). 

Assume your starting salary is represented by `salary`; that the percentage of your salary you put into a retirement fund is `save` and that the annual growth percentage of the retirement fund is `growthRate`. Then your retirement fund at the end of a given year represented by `F` and the end of the **previous year** `G`  should increase as follows: 

End of year 1: `F = salary * save * 0.01`

End of year 2: `F = G * (1+0.01 * growthRate) + salary * save * 0.01`

End of year 3: `F = G * (1+0.01 * growthRate) + salary * save * 0.01`

This process continues each year, with your retirement fund growing both by new contributions and by growth of the principal. Throughout this problem set, growth rates will always be positive (this is not true in the real world, alas!). 

## Specifications
Write a program that calculates the size of your retirement account at the end of each year. The program has to:
* ask for a users salary, the percentage of the salary that should be put into a retirement fund and the annual growth percentage of the retirement fund.
* use sensible default values if the user chooses not to provide an answers
* perform simply sanity checks on usr inputs, e.g. inputs are sensible numerical values
* allow to chose if their slary should grow with inflation. While this is a required specification, it is up to you to do the required research, thinking, math and decision of how to incorporate inflation.

Steps to completing this project:
1. Define the function for determining the retirement fund, not including inflation yet
2. Ask user for input for salary, save, and growthRate
3. Inflation should be incorporated into the function
4. Ask user if they want to include inflation in their calculation
5. Create if statements checking if user input is sensible (for ex. >0 and <100 for percentages)
6. Create default values for if user input is not sensible
