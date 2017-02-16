Goodland is a country with *n* cities, and each city *ci* is sequentially numbered from 0 to *n*-1. These cities are connected by *n*-1 roads, and each road connects city *ci* to its neighboring city, *ci+1*. The distance between any two cities *ci* and *cj* is |*i*-*j*|.

Goodland's government started a project to improve the country's infrastructure and bring electricity to its citizens. It built at most one electrical tower in every city, but they haven't turned any of them on yet. Once switched on, each tower produces enough power to provide electricity to all neighboring cities at a distance < *k* from the tower.

Help the goverment by finding and printing the minimum number of towers they must switch on to ensure that all Goodland's cities have electricity. If this task is not possible for the given value of *k* and configuration of towers, print -1.

###Input Format

The first line contains two space-separated integers denoting the respective number of cities in Goodland, *n*, and the tower's range constant, *k*. 
The second line contains *n* space-separated binary integers where each integer *i*(0≤*i*<*n*) denotes the number of electrical towers in city *ci*. Recall that the number of towers in a city will always be either 0 or 1.

###Constraints
* 1 ≤ *k* ≤ *n* ≤ 10^5
* It is guaranteed that the number of electrical towers in each city will be either 0 or 1.

###Subtask
* 1 ≤ *k* ≤ *n* ≤ 1000 for 40% of the maximum score.

###Output Format

Print a single integer denoting the minimum number of changes the government must make so that all Goodland's cities have electricity; if this is not possible for the given value of *k*, print -1.
