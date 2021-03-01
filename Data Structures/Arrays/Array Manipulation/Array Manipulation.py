#!/bin/python3

import os

def arrayManipulation(n, queries):
    array = [0] * (n + 1)
    max_sum = 0
    x = 0

    for a, b, k in queries:
        array[a] += k
        if b+1 <= n:
            array[b+1] -= k

    for i in range(n):
        x += array[i]
        max_sum = max(max_sum, x)

    return max_sum


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
