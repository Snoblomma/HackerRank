#!/bin/python3

import os
import sys


def number(primes, i):
    num = {}
    for prime in primes:
        num[prime] = 0
        while i % prime == 0:
            i = i // prime
            num[prime] += 1
    return num


def primeFactors(n):
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


def divisorsCount(n):
    count = 0
    for i in range(2, n + 1):
        primes = primeFactors(i)
        num = number(primes, i)
        print(i)
        print(primes)
        print(num)

    return count


def solve(n):
    d = divisorsCount(n)
    res = d % 1000007
    return res


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    result = solve(n)

    # fptr.write(str(result) + '\n')

    # fptr.close()
