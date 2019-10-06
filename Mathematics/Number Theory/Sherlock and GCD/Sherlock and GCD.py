#!/bin/python3

import os
import sys

def computeGCD(x, y):  
   while(y): 
       x, y = y, x % y 
   return x 

def solve(a):
    s = set(a)
    if len(s) > 1:
        if 1 in s:
            return 'YES'
        else:
            gcd = computeGCD(a[0], a[1]) 
            
            for i in range(2, len(a)): 
                gcd = computeGCD(gcd, a[i])
            
            if gcd == 1:
                return 'YES'

            else:
                for x in s:
                    for y in s:
                        if x != y:
                            gcd = computeGCD(x, y)
                            if gcd == 1:
                                return 'YES'
    else:
        return 'NO'

    return 'NO'

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        a_count = int(input())

        a = list(map(int, input().rstrip().split()))

        result = solve(a)

        fptr.write(result + '\n')

    fptr.close()
