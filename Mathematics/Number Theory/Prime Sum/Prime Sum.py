#!/bin/python3

import os
import sys

# Complete the solve function below.
def solve(n, k):

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
