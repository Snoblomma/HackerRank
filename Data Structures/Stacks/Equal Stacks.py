#!/bin/python3

import os
import sys

def equalStacks(h1, h2, h3):
    h1 = list(reversed(h1))
    h2 = list(reversed(h2))
    h3 = list(reversed(h3))
    sum1 = []
    sum2 = []
    sum3 = []
    for item in h1:
        sum1.append((0 if not sum1 else sum1[-1]) + item)

    for item in h2:
        sum2.append((0 if not sum2 else sum2[-1]) + item)

    for item in h3:
        sum3.append((0 if not sum3 else sum3[-1]) + item)

    intersect = set(sum1) & set(sum2) & set(sum3)
    return max(intersect) if len(intersect) > 0 else 0

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n1N2N3 = input().split()

    n1 = int(n1N2N3[0])

    n2 = int(n1N2N3[1])

    n3 = int(n1N2N3[2])

    h1 = list(map(int, input().rstrip().split()))

    h2 = list(map(int, input().rstrip().split()))

    h3 = list(map(int, input().rstrip().split()))

    result = equalStacks(h1, h2, h3)

    fptr.write(str(result) + '\n')

    fptr.close()
