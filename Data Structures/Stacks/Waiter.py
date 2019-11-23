#!/bin/python3

import os
import sys

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

def waiter(number, q):
    primes = SieveOfEratosthenes(1200)
    a = []
    b = []
    for i in range(q):
        prime = primes[i]
        print('prinme', prime)
        for n in number:
            if n%prime == 0:
                b.append(n)
            else:
                a.append(n)
    
    return b + a

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nq = input().split()

    n = int(nq[0])

    q = int(nq[1])

    number = list(map(int, input().rstrip().split()))

    result = waiter(number, q)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
