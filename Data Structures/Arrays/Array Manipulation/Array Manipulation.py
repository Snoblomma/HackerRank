#!/bin/python3

import math
import os
import random
import re
import sys

def arrayManipulation(n, queries):
    array = [0] * n
    maxm = 0
    for q in queries:
        a = q[0]
		b = q[1]
        q = q[2]
    
    for j in range(a-1, b):
        array[j] += k
        if array[j] > maxm:
            maxm = array[j]


    return maxm

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)

    fptr.write(str(result) + '\n')

    fptr.close()
