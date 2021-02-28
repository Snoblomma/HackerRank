#!/bin/python3

import math
import os
import random
import re
import sys

def arrayManipulation(n, queries):
    array = [0] * (n + 1)
    maxm = 0
    x = 0

    for query in queries:
        a = query[0]
        b = query[1]
        k = query[2]

        array[a] += k
        if b+1 <= n:
            array[b+1] -= k

    for i in range(1, n):
        x = x + array[i]
        if maxm < x:
            maxm = x

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
