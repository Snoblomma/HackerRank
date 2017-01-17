Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given *n* lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in *y-th* position of *x-th* line. 

Take your input from System.in.

###Input Format
The first line has an integer *n*. In each of the next *n* lines there will be an integer *d* denoting number of integers on that line and then there will be *d* space-separated integers. In the next line there will be an integer *q* denoting number of queries. Each query will consist of two integers *x* and *y*.

###Constraints

* 1 ≤ *n* ≤ 20000

* 0 ≤ *d* ≤ 50000

* 1 ≤ *q* ≤ 1000

* 1 ≤ *x* ≤ *n*

Each number will fit in signed integer.

Total number of integers in *n* lines will not cross 100000.

###Output Format

In each line, output the number located in *y-th* position of *x-th* line. If there is no such position, just print "ERROR!"
