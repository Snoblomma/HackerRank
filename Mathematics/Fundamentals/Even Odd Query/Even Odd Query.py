#!/bin/python3

import os
import sys

def find(x, y, A):
    if x < len(A) and A[x] == 0 and x != y:
        return 'Odd'
    
    if A[x-1] % 2 == 0:
        return 'Even'
    
    return 'Odd'

def solve(arr, queries):
    result = []
    for q in queries:
        x = q[0]
        y = q[1]
        ans = find(x, y, arr)
        result.append(ans)
    return result

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input())

    arr = list(map(int, input().rstrip().split()))

    q = int(input())

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    result = solve(arr, queries)

    fptr.write('\n'.join(result))
    fptr.write('\n')

    fptr.close()
