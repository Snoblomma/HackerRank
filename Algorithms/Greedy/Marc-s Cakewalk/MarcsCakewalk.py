#!/bin/python3

import math
import os
import random
import re
import sys

def marcsCakewalk(calorie):
    res = 0
    calorie = sorted(calorie)
    n = len(calorie)

    for i in range(n):
        res += calorie[n - 1 - i] * math.pow(2, i)

    return int(res)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    calorie = list(map(int, input().rstrip().split()))

    result = marcsCakewalk(calorie)

    fptr.write(str(result) + '\n')

    fptr.close()
