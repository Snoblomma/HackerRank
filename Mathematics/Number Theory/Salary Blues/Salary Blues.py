#!/bin/python3

import os
import sys
from math import gcd

def solve(a, queries):
    n = len(a)

    g = a[1] if n > 1 else a[0]

    for i in range(2, n):
        g = gcd(g, a[i])

    res = []
        
    for p in queries:
        if n == 1:
            res.append(a[0] + p)
        else:
            res.append(gcd(g, a[0] + p))
            
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nq = input().split()

    n = int(nq[0])

    q = int(nq[1])

    a = list(map(int, input().rstrip().split()))

    queries = []

    for _ in range(q):
        queries_item = int(input())
        queries.append(queries_item)

    result = solve(a, queries)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
