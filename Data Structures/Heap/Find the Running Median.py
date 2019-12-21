#!/bin/python3

import os
import sys
import statistics


def runningMedian(a):
    a.sort()
    medians = []
    for n in range(1, len(a)+1):
        m = a[:n]
        # print(m)
        # print(statistics.median(m))
        medians.append(float(statistics.median(m)))
    return medians

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a_count = int(input())

    a = []

    for _ in range(a_count):
        a_item = int(input())
        a.append(a_item)

    result = runningMedian(a)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
