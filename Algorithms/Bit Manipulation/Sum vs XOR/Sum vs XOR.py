#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the sumXor function below.
def sumXor(n):
    if n == 0:
        return 1
    else:
        binValue = bin(n)[2:]
        countZeroes = binValue.count('0')
        res = math.pow(2, countZeroes)
        return int(res)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    result = sumXor(n)

    fptr.write(str(result) + '\n')

    fptr.close()
