You have a string, *s*, of lowercase English alphabetic letters. You can perform two types of operations on *s*:
1. Append a lowercase English alphabetic letter to the end of the string.
2. Delete the last character in the string. Performing this operation on an empty string results in an empty string.

Given an integer, *k*, and two strings, *s* and *t*, determine whether or not you can convert *s* to *t* by performing *exactly* *k* of the above operations on *s*. If it's possible, print ```Yes```; otherwise, print ```No```.

###Input Format

The first line contains a string, *s*, denoting the initial string. 
The second line contains a string, *t*, denoting the desired final string. The third line contains an integer, *k*, denoting the desired number of operations.

###Constraints
* 1 ≤ |*s*| ≤ 100
* 1 ≤ |*t*| ≤ 100
* 1 ≤ *k* ≤ 100
* *s* and *t* consist of lowercase English alphabetic letters.

###Output Format

Print ```Yes``` if you can obtain string *t* by performing exactly *k* operations on *s*; otherwise, print ```No```.
