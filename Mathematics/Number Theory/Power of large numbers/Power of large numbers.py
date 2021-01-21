#!/bin/python3

import math
import os
import sys

def solve(a, b):
    return math.pow(a % 1000000007, b)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        ab = input().split()

        a = int(ab[0])
        b = int(ab[1])

        result = solve(a, b)

        fptr.write(str(result) + '\n')

    fptr.close()
