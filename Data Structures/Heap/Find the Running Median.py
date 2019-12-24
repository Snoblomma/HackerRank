#!/bin/python3

import os
import heapq


def runningMedian(a):
    minHeap = []
    maxHeap = []
    medians = []
    heapq.heapify(minHeap)
    currentMedian = 0

    for n in range(0, len(a)):
        current = a[n]
        if current > currentMedian:
            heapq.heappush(minHeap, current)
        elif current <= currentMedian:
            maxHeap.append(current)


        if len(maxHeap) > len(minHeap):
            s = max(maxHeap)
            heapq.heappush(minHeap, s)
            maxHeap.remove(s)
        elif len(minHeap) > len(maxHeap):
            maxHeap.append(minHeap[0])
            heapq.heappop(minHeap)
            

        if len(minHeap) == len(maxHeap):
            currentMedian = (minHeap[0]+ max(maxHeap))/2           
        elif len(minHeap) > len(maxHeap):
            currentMedian = minHeap[0]
        else:
            currentMedian = max(maxHeap)

        medians.append(currentMedian)

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
