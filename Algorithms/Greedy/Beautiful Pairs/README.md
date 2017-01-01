You are given two arrays, *A* and *B*, both containing *N* integers.

A pair of indices *(i, j)* is *beautiful* if the *i-th* element of array *A* is equal to the  element of array *B*. In other words, pair *(i,j)* is *beautiful* if and only if *Ai = Bj*.

Given *A* and *B*, there are *k* pairs of beautiful indices (i0,j0), ... (ik-1,jk-1). A pair of indices in this set is *pairwise disjoint* if and only if for each 0 ≤ *x* < *y* ≤ *k*-1 it holds that *ix* ≠ *iy* and *jx* ≠ *jy*.

Change exactly 1 element in *B* so that the resulting number of *pairwise disjoint beautiful* pairs is maximal, and print this maximal number to stdout.

###Input Format

The first line contains a single integer, *N* (the number of elements in *A* and *B*).

The second line contains *N* space-separated integers describing array *A*.

The third line contains *N* space-separated integers describing array *B*.

###Constraints

* 1 ≤ *N* ≤ 10^3

* 1 ≤ *Ai* ≤ 10^3

* 1 ≤ *Bi* ≤ 10^3

###Output Format

Determine and print the maximum possible number of pairwise disjoint beautiful pairs.

**Note**: You must first change 1 element in *B*, and your choice of element must be optimal.
