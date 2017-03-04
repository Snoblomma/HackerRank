You are given a sequence of *n* integers, *p(1), p(2) ... p(n)*. Each element in the sequence is distinct and satisfies 1 ≤ *p(x)* ≤ *n*. For each *x* where 1 ≤ *x* ≤ *n*, find any integer *y* such that *p(p(y))* ≡ *x* and print the value of *y* on a new line.

###Input Format

The first line contains an integer, *n*, denoting the number of elements in the sequence. 

The second line contains *n* space-separated integers denoting the respective values of *p(1), p(2),...p(n)*.

###Constraints

* 1 ≤ *n* ≤ 50
* 1 ≤ *p(x)* ≤ 50, where 1 ≤ *x* ≤ *n*.
* Each element in the sequence is distinct.

###Output Format

For each *x* from 1 to *n*, print an integer denoting any valid *y* satisfying the equation *p(p(y))* ≡ *x* on a new line.

###Sample Input 0
```
3
2 3 1
```
###Sample Output 0
```
2
3
1
```
