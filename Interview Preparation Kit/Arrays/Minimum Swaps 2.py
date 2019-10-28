import math
import os
import random
import re
import sys

def minimumSwaps(arr):
    N = len(arr)
    inPlace = 0

    for i in range(N):
        if arr[i] == i+1:
            inPlace+=1

    return N - inPlace - 1

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = minimumSwaps(arr)

    fptr.write(str(res) + '\n')

    fptr.close()
