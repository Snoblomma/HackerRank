Consider two sets of positive integers, *A = {a0, a1,...an-1}* and *B = {b0, b1, .. bn-1}*. We say that a positive integer, *x*, is between sets *A* and *B* if the following conditions are satisfied:
1. All elements in *A* are factors of *x*.
2. *x* is a factor of all elements in *B*.

Given *A* and *B*, find and print the number of integers (i.e., possible *X*'s) that are *between* the two sets.

###Input Format

The first line contains two space-separated integers describing the respective values of *n* (the number of elements in set *A*) and *m* (the number of elements in set *B*). 
The second line contains *n* distinct space-separated integers describing *a0, a1, .. an-1*. 
The third line contains *m* distinct space-separated integers describing *b0, b2, ... bn-1*.

###Constraints
* 1 ≤ *n,m* ≤ 10
* 1 ≤ *ai* ≤ 100
* 1 ≤ *bi* ≤ 100

###Output Format

Print the number of integers that are considered to be *between* *A* and *B*.
