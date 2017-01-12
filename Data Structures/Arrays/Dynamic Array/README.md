* Create a list, *seqList*, of *N* empty sequences, where each sequence is indexed from 0 to *N - 1*. The elements within each of the *N* sequences also use 0-indexing.
* Create an integer, *lastAns*, and initialize it to 0.
* The 2 types of queries that can be performed on your list of sequences (*seqList*) are described below:
  1. Query: 1 x y
    1. Find the sequence, *seq*, at index *((x ^ lastAns) % N)* in *seqList*.
    2. Append integer *y* to sequence *seq*.
  2. Query: 2 x y
    1. Find the sequence, *seq*, at index *((x ^ lastAns) % N)* in *seqList*.
    2. Find the value of element *y % size* in *seq* (where *size* is the size of *seq*) and assign it to *lastAns*.
    3. Print the new value of *lastAns* on a new line.
    
###Task 

Given *N*, *Q*, and *Q* queries, execute each query.

###Input Format

The first line contains two space-separated integers, *N* (the number of sequences) and *Q* (the number of queries), respectively. 
Each of the *Q* subsequent lines contains a query in the format defined above.

###Constraints

* 1 ≤ *N,Q* ≤ 10^5

* 0 ≤ *x* ≤ 10^9

* 0 ≤ *y* ≤ 10^9

* It is guaranteed that query type 2 will never query an empty sequence or index.

###Output Format

For each type 2 query, print the updated value of *lastAns* on a new line.

 
