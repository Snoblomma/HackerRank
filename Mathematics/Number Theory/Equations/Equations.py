#!/bin/python3

import os
import sys


def count_appearances(primes, i):
    num = {}
    # num = 0
    for prime in primes:
        num[prime] = 0
        while i % prime == 0:
            i = i // prime
            num[prime] += 1
            # num += 1

    for key in num:
        num[key] *= 2

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
        num = count_appearances(primes, i)
        # count += num
        print(i)
        print(num)
        # print(num)

    return count


def solve(n):
    d = divisorsCount(n)
    res = d % 1000007
    return res


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    result = solve(n)
    print(result)

    # fptr.write(str(result) + '\n')

    # fptr.close()
