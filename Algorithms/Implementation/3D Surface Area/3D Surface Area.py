#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the surfaceArea function below.
def surfaceArea(A):
    h = len(A)
    w = len(A[0])

    line1 = 0
    for i in range(w):
        line1 += A[0][i]
        line1 += A[w-1][i]
    print(line1)

    line4 = 0
    for i in range(h):
        line4 += A[i][0]
        line4 += A[i][h-1]
    print(line4)

    hDiff = 0
    for i in range(h-1):
        for j in range(w):
            f1 = A[j][i]
            f2 = A[j][i+1]
            f = abs(f1-f2)
            hDiff += f
    print(hDiff)

    wDiff = 0
    for j in range(w-1):
        for i in range(h):
            f1 = A[j][i]
            f2 = A[j+1][i]
            f = abs(f1-f2)
            wDiff += f
    print(wDiff)
    res = w*h*2 + hDiff + wDiff + line1 + line4
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    HW = input().split()

    H = int(HW[0])

    W = int(HW[1])

    A = []

    for _ in range(H):
        A.append(list(map(int, input().rstrip().split())))

    result = surfaceArea(A)

    fptr.write(str(result) + '\n')

    fptr.close()
