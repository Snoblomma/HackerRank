#!/bin/python3

import os
import sys
import math

d = [6, 2, 4, 8]


def solve(n):
    i = int((math.log(n, 2)))
    lastDigits = 0

    m = 0
    for j in range(n+1):
        m += 2**(2*j)
    
    m = int(str(m)[-1])

    for s in range(i+1):
        k = m *(2**(2**(s)))
        lastDigits += int(str(k)[-1])

    return str(lastDigits)[-1]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        fptr.write(str(result) + '\n')

    fptr.close()
