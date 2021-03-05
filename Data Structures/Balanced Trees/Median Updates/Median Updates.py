import statistics
import heapq


#!/bin/python
def median(a, x):
    l = []
    max_heap = heapq._heapify_max([])
    min_heap = heapq.heapify([])
    median = None
    for i in range(len(a)):
        op = a[i]
        num = x[i]
        if op == 'a':
            if len(min_heap) == 0 and len(max_heap) == 0:
                median = num
            elif num < heapq.nlargest(1, max_heap):
                m = heapq.nlargest(1, max_heap)
                heapq._heappop_max(max_heap)
                if len(min_heap) == len(max_heap):
                    median = m
                else:
                    heapq.heappush(min_heap, m)
                
                if median != None:
                    print(median)
                else:
                    a = heapq.nlargest(1, max_heap)
                    b = heapq.nsmallest(1, min_heap)
                    print((a + b) / 2)
            elif num == heapq.nlargest(1, max_heap) or num == heapq.nsmallest(1, min_heap):
                median = num
                print(median)

        else:
            if num in l:
                l.remove(num)
                if len(l) > 0:
                    print(statistics.median(l))
                else:
                    print('Wrong!')
            else:
                print('Wrong!')


N = int(input())
s = []
x = []
for i in range(0, N):
    tmp = input().strip().split(' ')
    a, b = [xx for xx in tmp]
    s.append(a)
    x.append(int(b))

median(s, x)
