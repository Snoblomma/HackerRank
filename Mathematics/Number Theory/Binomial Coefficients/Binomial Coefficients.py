#!/bin/python3

import os
import sys

def binomial(n, k):
    b = 1
    for t in range(min(k, n-k)):
        b *= n
        b //= t+1
        n -= 1
    return b
    
def solve(n, p):
    count = 0
    
    for y in range(n + 1):
        b = binomial(n, y)

        if b % p == 0: 
            count += 1 
    
    return count


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        np = input().split()

        n = np[0]

        p = int(np[1])

        result = solve(n, p)

        fptr.write(str(result) + '\n')

    fptr.close()
