We say that a string, *s*, contains the word ```hackerrank``` if a subsequence of the characters in *s* spell the word ```hackerrank```. For example, ```haacckkerrannkk``` does contain ```hackerrank```, but ```haacckkerannk``` does not (the characters all appear in the same order, but it's missing a second ```r```).

More formally, *p0*, *p1*, ... *p9* let  be the respective indices of ```h```, ```a```, ```c```, ```k```, ```e```, ```r```, ```r```, ```a```, ```n```, ```k``` in string *s*. If *p0* < *p1* < *p2* < ...< *p9* is true, then *s* contains ```hackerrank```.

You must answer *q* queries, where each query *i* consists of a string, *si*. For each query, print ```YES``` on a new line if *si* contains ```hackerrank```; otherwise, print ```NO``` instead.

### Input Format

The first line contains an integer denoting *q* (the number of queries). 

Each line *i* of the *q* subsequent lines contains a single string denoting *si*.

### Constraints

* 2 ≤ *q* ≤ 100
* 10 ≤ |*si*| ≤ 10^4

### Output Format

For each query, print ```YES``` on a new line if *si* contains hackerrank; otherwise, print ```NO``` instead.

### Sample Input 0
```
2
hereiamstackerrank
hackerworld
```
### Sample Output 0
```
YES
NO
```
