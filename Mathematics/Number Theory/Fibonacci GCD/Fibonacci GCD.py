#!/bin/python3

import math
import os
import sys


def find_gcd(x, y):
    while(y):
        x, y = y, x % y

    return x


def fibonacci(n):
    phi = (1 + math.sqrt(5)) / 2
    return round(pow(phi, n) / math.sqrt(5))


def solve(a):
    fib = []
    for item in a:
        fib.append(fibonacci(item))

    num1 = fib[0] 
    num2 = fib[1] 
    gcd = find_gcd(num1,num2) 
    
    for i in range(2, len(fib)): 
        gcd = find_gcd(gcd, fib[i]) 
        
    return gcd


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())
    l = []

    for n_itr in range(n):
        l.append(int(input()))

    result = solve(l)

    fptr.write(str(result) + '\n')

    fptr.close()
