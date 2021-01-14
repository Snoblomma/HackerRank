#!/bin/python3

import math
import os
import sys

# Complete the solve function below.
def solve(a, b, n):
    phi = (1 + math.sqrt(5)) / 2
  
    return round(pow(phi, n) / math.sqrt(5)) 

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        abn = input().split()

        a = int(abn[0])

        b = int(abn[1])

        n = int(abn[2])

        result = solve(a, b, n)

        fptr.write(str(result) + '\n')

    fptr.close()
