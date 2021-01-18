#!/bin/python3

import math
import os
import sys


def tan(x):
    return math.tan(x)

# Complete the solve function below.


def solve(a, n):
    if n == 1:
        return math.tan(a)
    else:
        # tan(n*a) = 2 * tan((n/2)*a)/(1 + tan((n/2)*a)*tan((n/2)*a))
        tanalpha = 2 * solve(a, n//2) / (1 + solve(a, n//2)*solve(a, n//2))
        if n % 2 == 0:
            return tanalpha
        else:
            return (tanalpha + math.tan(1))/(1 - tanalpha * math.tan(1))


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        pqn = input().split()

        p = int(pqn[0])

        q = int(pqn[1])

        n = int(pqn[2])

        result = solve(p / q, n)

        fptr.write(str(result) + '\n')

    fptr.close()
