#!/bin/python3

import os
import sys
from random import randint


def prime(n):
    if n < 4:
        return n == 2 or n == 3
    for i in range(5):
        a = randint(2, n-2)
        if pow(a, n-1, n) != 1:
            return False
    return True


def solve(n, k):
    if n < 2*k:
        return 'No'
    elif k == 1:
        if prime(n):
            return 'Yes'
        return 'No'
    elif k == 2:
        if n & 1:
            if prime(n-2):
                return 'Yes'
            return 'No'
        return 'Yes'
    return 'Yes'


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        nk = input().split()

        n = int(nk[0])

        k = int(nk[1])

        result = solve(n, k)

        fptr.write(result + '\n')

    fptr.close()
