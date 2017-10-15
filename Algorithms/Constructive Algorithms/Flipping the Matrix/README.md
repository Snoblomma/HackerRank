Sean invented a game involving a *2n*x*2n* matrix where each cell of the matrix contains an integer. He can reverse any of its rows or columns any number of times, and the goal of the game is to maximize the sum of the elements in the *n*x*n* submatrix located in the upper-left corner of the *2n*x*2n* matrix (i.e., its upper-left quadrant).

Given the initial configurations for *q* matrices, help Sean reverse the rows and columns of each matrix in the best possible way so that the sum of the elements in the matrix's upper-left quadrant is maximal. For each matrix, print the maximized sum on a new line.

### Input Format

The first line contains an integer, *q*, denoting the number of queries. The subsequent *q* lines describe each of the queries in the following format:

1. The first line of each query contains an integer, *n*.
2. Each line *i* the *2n* subsequent lines contains *2n* space-separated integers describing the respective values of row *i* in the matrix.

### Constraints

* 1 ≤ *q* ≤ 16
* 1 ≤ *n* ≤ 128
* 0 ≤ *matrix[i][j]* ≤ 4096, where 0 ≤ *i*,*j* < 2*n*

### Output Format

You must print *q* lines of output. For each query (i.e., matrix), print the maximum possible sum of the elements in the matrix's upper-left quadrant.

### Sample Input
```
1
2
112 42 83 119
56 125 56 49
15 78 101 43
62 98 114 108
```
### Sample Output
```
414
```
