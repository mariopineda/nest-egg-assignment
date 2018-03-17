# nest-egg-assignment
In this assignment you will model a retirement fund with some simple equations. 

We are going to start with a simple model of saving for retirement. Many employers will contribute the equivalent of 5% of your salary to a retirement fund, and then will match any contribution that you add, dollar for dollar, up to an additional 5%. Thus you can salt away up to 15% of your salary into a retirement account (10% of which comes as a bonus from your employer). 

Assume your starting salary is represented by `salary`; that the percentage of your salary you put into a retirement fund is `save` and that the annual growth percentage of the retirement fund is `growthRate`. Then your retirement fund at the end of a given year represented by the list `F` and the end of the **previous year** `G`  should increase as follows: 

End of year 1: `F = salary * save * 0.01`

End of year 2: `F = G * (1+0.01 * growthRate) + salary * save * 0.01`

End of year 3: `F = G * (1+0.01 * growthRate) + salary * save * 0.01`

This process continues each year, with your retirement fund growing both by new contributions and by growth of the principal. Throughout this problem set, growth rates will always be positive (this is not true in the real world, alas!). 

Write a program that calculates the size of your retirement account at the end of each year.


