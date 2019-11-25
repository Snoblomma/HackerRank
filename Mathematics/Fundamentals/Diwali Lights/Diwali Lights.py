#!/bin/python3

import os
import sys

def factorial(n):
    res = 1
    for i in range(n, 0, -1):
        res *= i
    return res

def nChooseR(n, r):
    s = 1
    m = min(n, n-r)
    for i in range(n, m, -1):
        s *= i
    f = factorial(r)
    return s/f


def lights(n):
    res = 0
    for i in range(1, n):
        res += nChooseR(n, i)
    res = res*2
    return int(res%100000)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = lights(n)

        fptr.write(str(result) + '\n')

    fptr.close()
