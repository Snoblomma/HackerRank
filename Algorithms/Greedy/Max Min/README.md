Given a list of *N* integers, your task is to select *K* integers from the list such that its *unfairness* is minimized.

if *(x1, x2,...,xk)* are *K* numbers selected from the list *N*, the unfairness is defined as

*max(x1, x2,...,xk) - min(x1, x2,...,xk)*

where *max* denotes the largest integer among the elements of *K*, and *min* denotes the smallest integer among the elements of *K*.

###Input Format 

The first line contains an integer *N*.

The second line contains an integer *K*. 

*N* lines follow. Each line contains an integer that belongs to the list *N*.

*Note:* Integers in the list *N* may not be unique.

###Output Format 

An integer that denotes the minimum possible value of *unfairness*.

###Constraints 

* 2 ≤ *N* ≤ 10^5

* 2 ≤ *K* ≤ *N*

* 0 ≤ *integer in N* ≤ 10^9
