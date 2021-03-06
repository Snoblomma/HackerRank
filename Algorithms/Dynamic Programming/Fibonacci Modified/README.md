We define a *modified* Fibonacci sequence using the following definition:

Given terms *ti* and *t(i+1)* where *i* Є [1,∞), term *t(i+2)* is computed using the following relation:

*t(i+2)* = *ti* + *t(i+1)*^2

For example, if term *t1* = 0 and *t2* = 1, term *t3* = 0 + 1^2 = 1, term *t4* = 1 + 1^2 = 2, term *t5* = 1 + 2^2 = 5, and so on.

Given three integers, *t1*, *t2*, and *n*, compute and print term *tn* of a *modified Fibonacci sequence*.

**Note:** The value of *tn* may far exceed the range of a 64-bit integer. Many submission languages have libraries that can handle such large results but, for those that don't (e.g., C++), you will need to be more creative in your solution to compensate for the limitations of your chosen submission language.

### Input Format

A single line of three space-separated integers describing the respective values of *t1*, *t2*, and *n*.

### Constraints
* 0 ≤ *t1*, *t2* ≤ 2
* 3 ≤ *n* ≤ 20
* *tn* may far exceed the range of a 64-bit integer.

### Output Format

Print a single integer denoting the value of term *tn* in the modified Fibonacci sequence where the first two terms are *t1* and *t2*.

### Sample Input
```
0 1 5
```
### Sample Output
```
5
```
