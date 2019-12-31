#!/bin/python3

import os
import sys


def fact(n):
    res = n
    for i in range(n-1, 1, -1):
        print(i)
        res *= i
    print(res)
    return res

def divisorsCount(n):
    count = 0
    for i in range(1, int(n/2)+1):
        if(n%i == 0):
            print(i)
            count+=1 
        
    return count

def solve(n):
    f = fact(n)*2
    d = divisorsCount(f)
    res = d % 1000007
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    result = solve(n)

    fptr.write(str(result) + '\n')

    fptr.close()
