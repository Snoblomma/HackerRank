#!/bin/python3

import math
import os
import random
import re
import sys

def organizingContainers(container):
    boxTotals = []
    ballTotals = []
    n = len(container)
    for i in range(n):
        boxTotals.append(sum(container[i]))
        j = 0
        total = 0
        for j in range(n):
            total += container[j][i]
        ballTotals.append(total)

    boxTotals.sort()
    ballTotals.sort()

    if boxTotals == ballTotals:
        return "Possible"
    else:
        return "Impossible"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        n = int(input())

        container = []

        for _ in range(n):
            container.append(list(map(int, input().rstrip().split())))

        result = organizingContainers(container)

        fptr.write(result + '\n')

    fptr.close()
