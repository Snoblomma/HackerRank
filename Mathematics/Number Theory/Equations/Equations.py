#!/bin/python3

import os
import sys

def count_divisors(num):
    count = 1
    for key in num:
        count = count * ((num[key] + 1) % 1000007 )
    
    return count

def prime_factors(factors, n):

    for key in factors:
        if n % key == 0:
            while n % key == 0:
                n = n // key
                factors[key] += 2
               
    if n != 1:
        factors[n] = 2

    return factors

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
