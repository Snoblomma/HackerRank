Given *n* two-dimensional points in space, determine whether they lie on some vertical or horizontal line. If yes, print *YES*; otherwise, print *NO*.

### Input Format

The first line contains a single positive integer, *n*, denoting the number of points.

Each line *i* of *n* subsequent lines contain two space-separated integers detailing the respective values of *xi* and *yi*(i.e., the coordinates of the *i-th* point).

### Constraints

* 2 <= *n* <= 10
* -10 <= *xi*, *yi* <= 10

### Output Format

Print YES if all points lie on some horizontal or vertical line; otherwise, print NO.

### Sample Input 0
```
5
0 1
0 2
0 3
0 4
0 5
```
### Sample Output 0
```
YES
```
### Explanation 0

All points lie on a vertical line.

### Sample Input 1
```
5
0 1
0 2
1 3
0 4
0 5
```
### Sample Output 1
```
NO
```
### Explanation 1

The points do not all form a horizontal or vertical line.
