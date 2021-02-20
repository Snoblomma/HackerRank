#!/bin/python3

import os
import sys


def solve(n):
    # p = (pow(2, n) - n) % 1000000007
    p = 1000000007
    p1 = (pow(2, n, p-1)-n % (p-1)) % (p-1)
    return pow(2, p1)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        fptr.write(str(result) + '\n')

    fptr.close()
