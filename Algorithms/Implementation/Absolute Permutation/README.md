We define *P* to be a permutation of the first *N* natural numbers in the range [1, *N*]. Let *posi* denote the position of *i* in permutation *P* (please use 1-based indexing).

*P* is considered to be an *absolute permutation* if *abs(posi - i) = K* holds true for every *i Є [1, N]*.

Given *N* and *K*, print the lexicographically smallest absolute permutation, *P*; if no absolute permutation exists, print -1.

###Input Format

The first line of input contains a single integer, *T*, denoting the number of test cases. 

Each of the *T* subsequent lines contains 2 space-separated integers describing the respective *N* and *K* values for a test case.

###Constraints

* 1 ≤ *T* ≤ 10

* 1 ≤ *N* ≤ 10^5

* 0 ≤ *K* < *N*

###Output Format

On a new line for each test case, print the lexicographically smallest absolute permutation; if no absolute permutation exists, print -1.
