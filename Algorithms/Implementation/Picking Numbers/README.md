Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is ≤ 1.

### Input Format

The first line contains a single integer, *n*, denoting the size of the array. 

The second line contains *n* space-separated integers describing the respective values of *a0*, *a1*, ..., *an-1*.

### Constraints

* 2 ≤ *n* ≤ 100
* 0 < *ai* < 100
* The answer will be ≥ 2.

### Output Format

A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is ≤ 1.

### Sample Input 0
```
6
4 6 5 3 3 1
```
### Sample Output 0
```
3
```

### Explanation 0

We choose the following multiset of integers from the array: {4, 3, 3}. Each pair in the multiset has an absolute difference ≤ 1 (i.e., |4 - 3| = 1 and |3 - 3| = 0), so we print the number of chosen integers, 3, as our answer.
