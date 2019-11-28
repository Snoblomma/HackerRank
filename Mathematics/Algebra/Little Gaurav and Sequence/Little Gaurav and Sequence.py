#!/bin/python3

import os
import sys

d = [6, 2, 4, 8]


def solve(n):
    i = 0
    while 2**i <= n:
        i+=1
    
    lastDigits = 0
    for s in range(i):
        k = 0
        for j in range(n+1):
            power = (2**s + 2*j) 
            k += d[power%4]
        lastDigits += int(str(k)[-1])
    return str(lastDigits)[-1]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        fptr.write(str(result) + '\n')

    fptr.close()
