John Watson performs an operation called a right circular rotation on an array of integers, *[a0, a1 ... a(n-1)]*. After performing one right circular rotation operation, the array is transformed from *[a0, a1 ... a(n-1)]* to *[a(n-1), a0, a1 ... a(n-2)]*.

Watson performs this operation  times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks *q* queries, where each query consists of a single integer, *m*, for which you must print the element at index *m* in the rotated array (i.e., the value of *am*).

**Input Format**

The first line contains 3 space-separated integers, *n*, *k*, and *q*, respectively. 
The second line contains *n* space-separated integers, where each integer *i* describes array element *ai* (where *0<=i<n*). 
Each of the *q* subsequent lines contains a single integer denoting *m*.

**Constraints**

1<=n<=10^5

1<=ai<=10^5

1<=k<=10^5

1<=q<=500

0<=m<=N-1

**Output Format**

For each query, print the value of the element at index *m* of the rotated array on a new line.
