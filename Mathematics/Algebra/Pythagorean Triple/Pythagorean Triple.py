#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the pythagoreanTriple function below.
def pythagoreanTriple(a):
    res = [a]
    b = 0
    c = 0
    if a%2 == 1:
        b = (a**2-1)/2
        c = b+1
    else:
        m = a/2
        b = m**2 - 1
        c = m**2 + 1

    res.append(int(b))
    res.append(int(c))
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = int(input())

    triple = pythagoreanTriple(a)

    fptr.write(' '.join(map(str, triple)))
    fptr.write('\n')

    fptr.close()
