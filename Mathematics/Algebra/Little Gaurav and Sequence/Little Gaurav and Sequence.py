#!/bin/python3

import os
import math

lastDigits = [0, 6, 2, 8, 4]

def solve(n):
    i = int((math.log(n, 2)))

    if n%2 == 1:
        return 0
    else:
        return lastDigits[i%5]


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        fptr.write(str(result) + '\n')

    fptr.close()
