#!/bin/python3

import os
import sys
from fractions import gcd

def is_int_mult(c, g):
    return c % g == 0

def solve(a, b, c):
    if c <= a or c <=b:
        g = gcd(a, b)
        if is_int_mult(c, g):
            return 'YES'
    
    return 'NO'

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        abc = input().split()

        a = int(abc[0])

        b = int(abc[1])

        c = int(abc[2])

        result = solve(a, b, c)

        fptr.write(result + '\n')

    fptr.close()
