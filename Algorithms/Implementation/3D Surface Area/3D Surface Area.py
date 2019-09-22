#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the surfaceArea function below.
def surfaceArea(A, H, W):
    line1 = 0
    for j in range(0, W):
        line1 += A[0][j]
        line1 += A[H-1][j]
    print(line1)

    line4 = 0
    for i in range(0, H):
        line4 += A[i][0]
        line4 += A[i][W-1]
    print(line4)

    hDiff = 0
    for i in range(0, H-1):
        for j in range(0, W):
            f1 = A[i][j]
            f2 = A[i+1][j]
            hDiff +=abs(f1-f2)
    print(hDiff)

    wDiff = 0
    for j in range(0, W-1):
        for i in range(0, H):
            f1 = A[i][j]
            f2 = A[i][j+1]
            wDiff += abs(f1-f2)
    print(wDiff)
    res = W*H*2 + hDiff + wDiff + line1 + line4
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    HW = input().split()

    H = int(HW[0])

    W = int(HW[1])

    A = []

    for _ in range(H):
        A.append(list(map(int, input().rstrip().split())))

    result = surfaceArea(A, H, W)

    fptr.write(str(result) + '\n')

    fptr.close()
