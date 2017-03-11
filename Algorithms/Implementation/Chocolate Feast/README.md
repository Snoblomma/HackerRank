Little Bobby loves chocolate, and he frequently goes to his favorite 5&10 store, Penny Auntie, with *n* dollars to buy chocolates. Each chocolate has a flat cost of *c* dollars, and the store has a promotion where they allow you to trade in *m* chocolate wrappers in exchange for 1 free piece of chocolate.

For example, if *m* = 2 and Bobby has *n* = 4 dollars that he uses to buy 4 chocolates at *c* = 1 dollar apiece, he can trade in the 4 wrappers to buy 2 more chocolates. Now he has 2 more wrappers that he can trade in for 1 more chocolate. Because he only has 1 wrapper left at this point and 1 < *m*, he was only able to eat a total of 7 pieces of chocolate.

Given *n*, *m*, and *c* for *t* trips to the store, can you determine how many chocolates Bobby eats during each trip?

###Input Format

The first line contains an integer, *t*, denoting the number of trips Bobby makes to the store. 

Each line *i* of the *t* subsequent lines contains three space-separated integers describing the respective *n*, *c*, and *m* values for one of Bobby's trips to the store.

###Constraints

* 1 ≤ *t* ≤ 1000
* 2 ≤ *n* ≤ 10^5
* 1 ≤ *c* ≤ *n*
* 2 ≤ *m* ≤ *n*

###Output Format

For each trip to Penny Auntie, print the total number of chocolates Bobby eats on a new line.

###Sample Input
```
3
10 2 5
12 4 4
6 2 2
```
###Sample Output
```
6
3
5
```
