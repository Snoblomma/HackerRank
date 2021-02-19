#!/bin/python3

import os
import sys

# Complete the solve function below.
def solve(a, b, c, d, e, f, g, h, n):

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        abcdefghn = input().split()

        a = int(abcdefghn[0])

        b = int(abcdefghn[1])

        c = int(abcdefghn[2])

        d = int(abcdefghn[3])

        e = int(abcdefghn[4])

        f = int(abcdefghn[5])

        g = int(abcdefghn[6])

        h = int(abcdefghn[7])

        n = int(abcdefghn[8])

        result = solve(a, b, c, d, e, f, g, h, n)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
