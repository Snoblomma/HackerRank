#!/bin/python3

import os
import sys

def count_divisors(num):
    count = 1
    for key in num:
        count = count * (2 * num[key] + 1)
    
    return count

def prime_factors(test, n):
    primes = []
    for i in range(2, n + 1):
        if n % i == 0:
            isprime = 1
            for j in range(2, (i // 2 + 1)):
                if i % j == 0:
                    isprime = 0
                    break
                
            if isprime == 1:
                primes.append(i)
                while n % i == 0:
                    n = n // i
                    if i in test:
                        test[i] += 1
                    else:
                        test[i] = 1
    return test

def divisors_count(n):
    test = {}
    for i in range(2, n + 1):
        test = prime_factors(test, i)

    count = count_divisors(test)

    return count


def solve(n):
    d = divisors_count(n)
    res = d % 1000007
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    result = solve(n)

    fptr.write(str(result) + '\n')

    fptr.close()