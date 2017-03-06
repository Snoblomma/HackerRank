Erica wrote an increasing sequence of *n* numbers (*a0, a1, .. an-1*) in her notebook. She considers a triplet (*ai, aj, ak*) to be beautiful if:

* *i* < *j* < *k*
* *a[j]* - *a[i]* = *a[k]* - *a[j]* = *d*

Given the sequence and the value of *d*, can you help Erica count the number of beautiful triplets in the sequence?

###Input Format

The first line contains 2 space-separated integers, *n* (the length of the sequence) and *d* (the beautiful difference), respectively. 

The second line contains *n* space-separated integers describing Erica's increasing sequence, *a0, a1, ... an-1*.

###Constraints

* 1 ≤ *n* ≤ 10^4
* 1 ≤ *d* ≤ 20
* 0 ≤ *a1* ≤ 2*10^4
* *ai* > *ai-1* for 0 < *i* ≤ *n* - 1
 
###Output Format

Print a single line denoting the number of beautiful triplets in the sequence.
