#!/bin/python3

import os
import sys

primes = []

def SieveOfEratosthenes(n):
    prime = [True for i in range(n + 1)] 
    p = 2
    while (p * p <= n): 
        if (prime[p] == True): 
            for i in range(p * 2, n + 1, p): 
                prime[i] = False
        p += 1
    prime[0]= False
    prime[1]= False

    return list(p for p in range(n+1) if prime[p])

def primeCount(n):
    global primes
    count = -1
    mult = 1
    while mult <= n:
        mult = mult*primes[count + 1]
        count += 1

    return count
    

if __name__ == '__main__':
    primes = SieveOfEratosthenes(1200)
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        n = int(input())

        result = primeCount(n)

        fptr.write(str(result) + '\n')

    fptr.close()
