Little John has drawn *N* stars on his paper where each star has a weight *w*. He draws a straight line that divides the paper into two parts such that each part has a subset of stars in them. Let the weight of each part be the summation of weights of the stars in the part. He wants to draw the line such that the difference in the sum of weights between the two parts is as small as possible while maximizing the smaller part's weight.

Your task is to compute the weight of smaller part corresponding to this line where no stars are allowed to be on the line and line can be of any slope.

### Input Format 

The first line of the input contains an integer *N*. 

Each of next *N* lines contains three integers *xi* and *yi* specifying the positions of *i-th* star and *vi*. 

No three points lie on a line.

### Constraints 

* 1 <= *N* <=100
* -10^9 <= *xi*, *yi* <= 10^9
* 1 <= *vi* <= 1000

### Output Format 
Print an integer being the answer to the test.

### Sample Input 0
```
4
1 1 2
-1 1 2
-1 -1 4
1 -1 5
```
### Sample Output 0
```
6
```
### Explanation 
You can imagine a line along the *Y*-axis and see that point (-1,1) and (-1,-1) lie on left side summing up to 6, while the other side has sum as (5+2) = 7.

### Sample Input 1
```
10
748798831 -200797120 595
-774675771 179630170 159
-338760201 945958360 750
955629379 -312997434 516
755005057 -672683474 405
-743176829 190325067 86
-301478753 -718170081 923
-795908444 985440803 854
-102868895 671114060 246
-698209449 12550066 190
```
### Sample Output 1
```
2358
```
### Explanation

[595, 159, 405, 86, 923, 190] and [516, 750, 854, 246] are two sets of weights.
