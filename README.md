# nest-egg-assignment
In this assignment you will model a retirement fund with some simple equations. Assume your starting salary is represented by `salary`; that the percentage of your salary you put into a retirement fund is `save` and that the annual growth percentage of the retirement fund is `growthRate`. Then your retirement fund at the end of a given year represented by the list `F` and the end of the **previous year** `G`  should increase as follows: 

End of year 1: `F = salary * save * 0.01`
End of year 2: `F = G * (1+0.01 * growthRate) + salary * save * 0.01`
End of year 3: `F = G * (1+0.01 * growthRate) + salary * save * 0.01`
