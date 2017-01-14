You have to deal with 2 types of events: ENTER (a student enters the queue) or SERVED.

A unique token is assigned to any student entering the queue. The queue serves the students based on the following criteria:

1. The student having the highest Cumulative Grade Point Average (CGPA) is served first.
2. Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
3. Any students having the same CGPA and name will be served in ascending token order.

Given a sequence of *n* events, print the names of students who are yet to be served(based on above criteria). If the queue is empty, print EMPTY.

###Input Format

The first line contains an integer, *n*, denoting the total number of events. Each of the *n* subsequent lines will be of the following two forms:

1. **ENTER name CGPA token** - The student to be inserted into the priority queue.
2. **SERVED** - The highest priority student in the queue was served.

###Constraints

* 2 ≤ *n* ≤ 1000
* 0 ≤ *CGPA* ≤ 4.00
* 1 ≤ *token i* ≤ 10^5  where each token i is a unique integer.
* 2 ≤ |*name*| ≤ 30

###Output Format

Print the names (based on the criteria) of the students who are not served at all after executing all  events; if every student in the queue was served, then print EMPTY.
