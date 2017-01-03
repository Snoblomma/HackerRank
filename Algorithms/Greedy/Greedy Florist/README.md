You and *K - 1* friends want to buy *N* flowers. Each flower *fi* has some cost *ci*. The florist is greedy and wants to maximize his number of new customers, so he increases the sale price of flowers for repeat customers; more precisely, if a customer has already purchased *x* flowers, price *P* for *fi* is *Pfi = (x+1)* * *ci*.

Find and print the minimum cost for your group to purchase *N* flowers.

**Note:** You can purchase the flowers in any order.

###Input Format

The first line contains two integers, *N* (number of flowers to purchase) and *K* (the size of your group of friends, including you). 

The second line contains *N* space-separated positive integers describing the cost (*c0, c1, ... , cn-2, cn-1*) for each flower *fi* .

###Constraints

* 1 ≤ *N,K* ≤ 100

* 1 ≤ *ci* ≤ 10^6

* *answer* < 2*31

* 0 ≤ *i* ≤ *N* - 1

###Output Format

Print the minimum cost for buying *N* flowers.
