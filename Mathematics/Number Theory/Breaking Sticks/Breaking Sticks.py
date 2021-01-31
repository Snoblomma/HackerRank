#!/bin/python3

import math
import os
import random
import re
import sys

def breaks(a):
    count = 0
    counter = a
    while a > 1:
        if a % counter == 0:
            count += counter
            a = counter
            counter = a - 1
        else:
            counter -= 1
    return count 

def longestSequence(a):
    s = 0
    for item in a:
        s += breaks(item)
    return s + 1 if len(a) > 1 else s

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    a = list(map(int, input().rstrip().split()))

    result = longestSequence(a)

    fptr.write(str(result) + '\n')

    fptr.close()
