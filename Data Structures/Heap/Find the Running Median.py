#!/bin/python3

import os
import sys
import statistics


def runningMedian(a):
    minHeap = []
    maxHeap = []
    medians = []
    currentMedian = 0

    for n in range(0, len(a)):
        current = a[n]
        if current > currentMedian:
            minHeap.append(current)
        elif current <= currentMedian:
            maxHeap.append(current)

        if len(maxHeap) > len(minHeap):
            s = max(maxHeap)
            minHeap.append(s)
            maxHeap.remove(s)
        elif len(minHeap) > len(maxHeap):
            s = min(minHeap)
            maxHeap.append(s)
            minHeap.remove(s)

        if len(minHeap) == len(maxHeap):
            currentMedian = (min(minHeap)+ max(maxHeap))/2           
        elif len(minHeap) > len(maxHeap):
            currentMedian = min(minHeap)
        else:
            currentMedian = max(maxHeap)

        medians.append(currentMedian)

    print(medians)
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
