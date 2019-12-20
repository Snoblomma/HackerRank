#!/bin/python3

import os
import sys

def cookies(k, A):
    operations = 0
    A.sort()
    while len(A) > 0:
        if A[0] < k:
            if len(A) == 1:
                return -1
            else:
                t = [A[0] + 2*A[1]]
                A = t + A[2:]
                A.sort()
                operations += 1
        else:
            return operations
           
    return operations

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    A = list(map(int, input().rstrip().split()))

    result = cookies(k, A)

    fptr.write(str(result) + '\n')

    fptr.close()
