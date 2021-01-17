#!/bin/python3

import os
import sys

# Complete the solve function below.
def solve(p, q, n):
    return (p / q) % 1000000007

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        pqn = input().split()

        p = int(pqn[0])

        q = int(pqn[1])

        n = int(pqn[2])

        result = solve(p, q, n)

        fptr.write(str(result) + '\n')

    fptr.close()
