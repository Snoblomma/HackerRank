Lily has a chocolate bar consisting of a row of *n* squares where each square has an integer written on it. She wants to share it with Ron for his birthday, which falls on month *m* and day *d*. Lily only wants to give Ron a piece of chocolate if it contains *m* consecutive squares whose integers sum to *d*.

Given *m*, *d*, and the sequence of integers written on each square of Lily's chocolate bar, how many different ways can Lily break off a piece of chocolate to give to Ron?

For example, if *m* = 2, *d* = 3 and the chocolate bar contains *n* rows of squares with the integers [1, 2, 1, 3, 2] written on them from left to right, the following diagram shows two ways to break off a piece:

### Input Format

The first line contains an integer denoting *n* (the number of squares in the chocolate bar). 

The second line contains *n* space-separated integers describing the respective values of *s0*, *s1*, ... *sn-1* (the numbers written on each consecutive square of chocolate). 

The third line contains two space-separated integers describing the respective values of *d* (Ron's birth *day*) and *m* (Ron's birth *month*).

### Constraints

* 1 ≤ *n* ≤ 100
* 1 ≤ *si* ≤ 5, where 0 ≤ *i* < n 
* 1 ≤ *d* ≤ 31
* 1 ≤ *m* ≤ 12

### Output Format

Print an integer denoting the total number of ways that Lily can give a piece of chocolate to Ron.

### Sample Input 0
```
5
1 2 1 3 2 
3 2
```
### Sample Output 0
```
2
```
### Sample Input 1
```
6
1 1 1 1 1 1
3 2
```
### Sample Output 1
```
0
```