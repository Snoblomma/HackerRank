#!/bin/python3

import os
import sys

def get_gcds(a, b):

def is_int_mult(c, gcds):

def solve(a, b, c):
    if c <= a or c <=b:
        gcds = get_gcds(a, b)
        if is_int_mult(c, gcds)
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
