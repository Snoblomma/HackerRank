#!/bin/python3

import os
import sys

def div_fact(a, b):
    for i in range(2, b + 1):
        a = a // i
    return a

def fact(a):
    res = 1
    for i in range(2, a + 1):
        res = res * i
    
    return res

def solve(n, k):
    top = fact(k + n - 1)
    bott = n - 1
    
    first = div_fact(top, bott)
    res = div_fact(first, k)

    return res


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        k = int(input())

        result = solve(n, k)

        fptr.write(result + '\n')

    fptr.close()
