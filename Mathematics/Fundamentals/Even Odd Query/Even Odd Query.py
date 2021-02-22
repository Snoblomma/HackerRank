#!/bin/python3

import os
import sys



def find(x, y, A):
    if x > y:
        return 1
    ans = pow(A[x-1], find(x+1, y, A))
    return ans % 10

def solve(arr, queries):
    result = []
    for q in queries:
        x = q[0]
        y = q[1]
        ans = find(x, y, arr)
        result.append('Odd' if ans%2 == 1 else 'Even')
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
