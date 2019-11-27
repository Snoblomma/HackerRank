#!/bin/python3

import math
import os
import random
import re
import sys

def pythagoreanTriple(a):
    res = [a]
    b = 0
    c = 0
    if a%2 == 1:
        b = int(int((int(a)**2-1))//2)
        c = int(b)+1
    else:
        m = int(a/2)
        b = int(m**2) - 1
        c = int(m**2) + 1

    res.append(b)
    res.append(c)
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = int(input())

    triple = pythagoreanTriple(a)

    fptr.write(' '.join(map(str, triple)))
    fptr.write('\n')

    fptr.close()
