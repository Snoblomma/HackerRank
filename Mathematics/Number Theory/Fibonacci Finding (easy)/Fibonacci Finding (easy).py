#!/bin/python3

import os
import sys

# Complete the solve function below.
def solve(a, b, n):
    f = [a, b]  
    
    for i in range(2, n+1): 
        f.append(f[i-1] + f[i-2]) 
    return f[n] 

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
