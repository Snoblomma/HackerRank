Given a string, *S*, of lowercase letters, determine the index of the character whose removal will make *S* a palindrome. If *S* is already a palindrome or no such character exists, then print -1. There will always be a valid solution, and any correct answer is acceptable. For example, if  *S*="bcbc", we can either remove 'b' at index 0 or 'c' at index 3.

###Input Format

The first line contains an integer, *T*, denoting the number of test cases. 
Each line *i* of the *T* subsequent lines (where 0 ≤ *i* < *T*) describes a test case in the form of a single string, *Si*.

###Constraints
* 1 ≤ *T* ≤ 20
* 1 ≤ |*S*| ≤ 10^5+5
* All characters are lowercase English letters.

###Output Format

Print an integer denoting the *zero-indexed* position of the character that makes *S* not a palindrome; if *S* is already a palindrome or no such character exists, print -1.
