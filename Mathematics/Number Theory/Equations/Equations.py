#!/bin/python3

import os
import sys

def count_divisors(num):
    count = 1
    for key in num:
        count = count * (2 * num[key] + 1)
    
    return count

def prime_factors(factors, n):
    for i in range(2, n + 1):
        if n % i == 0:
            isprime = 1
            for j in range(2, (i // 2 + 1)):
                if i % j == 0:
                    isprime = 0
                    break
                
            if isprime == 1:
                while n % i == 0:
                    n = n // i
                    if i in factors:
                        factors[i] += 1
                    else:
                        factors[i] = 1
                
    return factors

def prime_factors_new(new, n, i):
    print('-------')
    print(new)
    for i in new.keys():
        new[i] *=2

    print(new)
    if n % i == 0:
        isprime = 1
        for j in range(2, (i // 2 + 1)):
            if i % j == 0:
                isprime = 0
                break
            
        if isprime == 1:
            while n % i == 0:
                n = n // i
                if i in new:
                    new[i] += 1
                else:
                    new[i] = 1
                
    return new

def divisors_count(n):
    factors = {}
    new = {}
    for i in range(2, n + 1):
        factors = prime_factors(factors, i)

    for i in range(2, n):
        new = prime_factors_new(new, n + 1, i)

    count = count_divisors(factors)
    print(factors)
    print(new)
    return count


def solve(n):
    d = divisors_count(n)
    res = d % 1000007
    return res

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    result = solve(n)
    print(result)
    # fptr.write(str(result) + '\n')

    # fptr.close()