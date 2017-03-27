A numeric string, *s*, is *beautiful* if it can be split into a sequence of two or more positive integers, *a1*, *a2*, ... *an*, satisfying the following conditions:

1. *ai* - *ai-1* = 1 for any 1 < *i* ≤ *n* (i.e., each element in the sequence is 1 more than the previous element).
2. **No *ai* contains a leading zero.** For example, we can split *s* = 10203 into the sequence {1, 02, 03}, but it is **not** beautiful because 02 and 03 have leading zeroes.
3. *The contents of the sequence cannot be rearranged.* For example, we can split *s* = 312 into the sequence {3,1,2}, but it is not beautiful because it breaks our first constraint (i.e., 1 - 3 != 1).

The diagram below depicts some beautiful strings:

![alt text](https://s3.amazonaws.com/hr-assets/0/1486398483-1b25a912c1-Separate.png "diagram")

You must perform *q* queries, where each query consists of some string *s*. For each query, print whether or not the string is beautiful on a new line. If it's beautiful, print ```YES x```, where *x* is the first number of the increasing sequence (if there are multiple such values of *x*, choose the smallest); otherwise, print ```NO``` instead.

### Input Format

The first line contains an integer denoting *q* (the number of strings to evaluate). 

Each of the *q* subsequent lines contains some string *s* for a query.

### Constraints

* 1 ≤ *q* ≤ 10
* 1 ≤ |*s*| ≤ 32
* Each character in *s* is a decimal digit from 0 to 9 (inclusive).

### Output Format

For each query, print its answer on a new line (i.e., either ```YES x``` where *x* is the smallest first number of the increasing sequence, or ```NO```).

### Sample Input 0
```
7
1234
91011
99100
101103
010203
13
1
```
### Sample Output 0
```
YES 1
YES 9
YES 99
NO
NO
NO
NO
```
