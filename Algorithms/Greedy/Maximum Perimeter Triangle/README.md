Given n sticks of lengths l0, l1.. l(n-1), use 3 of the sticks to construct a non-degenerate triangle with the maximum possible perimeter. Then print the lengths of its sides as 3 space-separated integers in non-decreasing order.

If there are several valid triangles having the maximum perimeter:

Choose the one with the longest maximum side (i.e., the largest value for the longest side of any valid triangle having the maximum perimeter).

If more than one such triangle meets the first criterion, choose the one with the longest minimum side (i.e., the largest value for the shortest side of any valid triangle having the maximum perimeter).

If more than one such triangle meets the second criterion, print any one of the qualifying triangles.

If no non-degenerate triangle exists, print -1.

###Input Format

The first line contains single integer, n, denoting the number of sticks.

The second line contains n space-separated integers, l0, l1.. l(n-1), describing the respective stick lengths.

###Constraints

* 3 <= n <= 50

* 1 <= li <= 10^9

###Output Format

Print 3 non-decreasing space-separated integers, a, b, and c (where a <= b <= c) describing the respective lengths of a triangle meeting the criteria in the above Problem Statement.

If no non-degenerate triangle can be constructed, print -1.
