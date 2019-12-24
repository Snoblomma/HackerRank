#!/bin/python3

import math
import os
import random
import re
import sys

def lonelyinteger(a):
    res = ''
    myset = set(a)
    for item in myset:
        if a.count(item)== 1:
            res += str(item) + ' '
    return res


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    a = list(map(int, input().rstrip().split()))

    result = lonelyinteger(a)

    fptr.write(str(result) + '\n')

    fptr.close()
