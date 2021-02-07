#!/bin/python3

import os
import sys

def count_divisors(num):
    count = 1
    for key in num:
        count = count * (2 * num[key] + 1)
    
    return count

def count_appearances(num, primes, i):

    for prime in primes:
        while i % prime == 0:
            i = i // prime
            if prime in num:
                num[prime] += 1
            else:
                num[prime] = 1

    return num


def prime_factors(n):
    primes = []
    for i in range(2, n + 1):
        if n % i == 0:
            isprime = 1
            for j in range(2, (i // 2 + 1)):
                if(i % j == 0):
                    isprime = 0
                    break

            if (isprime == 1):
                primes.append(i)

    return primes


def divisors_count(n):
    num = {}
    for i in range(2, n + 1):
        primes = prime_factors(i)
        num = count_appearances(num, primes, i)

    count = count_divisors(num)

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
