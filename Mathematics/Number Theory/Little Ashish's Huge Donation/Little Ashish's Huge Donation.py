#!/bin/python3

import os
import sys

def binary_search(low, high, x): 
    if high >= low: 
  
        mid = (high + low) // 2

        k = (mid * (mid + 1) * (2 * mid + 1)) / 6
        ks = ((mid + 1) * (mid + 2) * (2 * (mid + 1) + 1)) / 6

        if k <= x and ks > x:
            return mid 
        elif k > x: 
            return binary_search(low, mid - 1, x) 
        else: 
            return binary_search(mid + 1, high, x) 
  
    else: 
        return -1

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        x = int(input())

        result = binary_search(0, 10**16, x)

        fptr.write(str(result) + '\n')

    fptr.close()
