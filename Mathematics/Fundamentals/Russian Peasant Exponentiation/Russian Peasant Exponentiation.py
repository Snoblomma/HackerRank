#!/bin/python3

import os
import sys
import math

# Complete the solve function below.
def solve(a, b, k, m):
    r = math.sqrt(a*a + b*b)
    arc = 0
    if a == 0 and b > 0:
        arc = math.atan(90)
    elif a == 0 and b < 0:
        arc = math.atan(270)
    else:
        arc = math.atan(b/a)
        
    powX = math.pow(r, k)
    A = k * arc
    newX = powX * math.cos(A)
    newY = powX * math.sin(A)
    print(round(newX))
    print(round(newY))
    return [round(newX)%m, round(newY)%m]


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        abkm = input().split()

        a = int(abkm[0])

        b = int(abkm[1])

        k = int(abkm[2])

        m = int(abkm[3])

        result = solve(a, b, k, m)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
