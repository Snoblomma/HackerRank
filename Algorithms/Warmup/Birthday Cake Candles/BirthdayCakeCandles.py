#!/bin/python3

import sys

def birthdayCakeCandles(n, ar):
    ar.sort()
    count = 0
    max = ar[-1]
    
    for i in reversed(ar):
        if i == max:
            count = count+1
        else:
            break
    return count

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = birthdayCakeCandles(n, ar)
print(result)
