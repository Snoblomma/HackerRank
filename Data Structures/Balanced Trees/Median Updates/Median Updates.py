#!/bin/python

import statistics
import heapq


def print_median(median, largest, smallest):
    if median != None:
        print(median)
    else:
        # a = heapq.nlargest(1, right_heap)
        # b = heapq.nsmallest(1, left_heap)
        print((largest + smallest) / 2)

def median(a, x):
    l = []
    # right_heap = heapq._heapify_max([])
    # left_heap = heapq.heapify([])
    left_heap = []
    right_heap = []
    largest_left = None
    smallest_right = None
    median = None
    for i in range(len(a)):
        op = a[i]
        num = x[i]
        if op == 'a':
            if len(left_heap) == 0 and len(right_heap) == 0:
                median = num
            elif num < largest_left:
                m = largest_left
                # heapq._heappop_max(right_heap)
                left_heap, largest_left = remove_from_heap(left_heap, largest_left)
                if len(left_heap) == len(right_heap):
                    median = m
                else:
                    # heapq.heappush(left_heap, m)
                    left_heap, largest_left = push_to_min(left_heap, m)
                
                print_median(median, left_heap, right_heap)

            elif num > smallest_right:
                m = smallest_right
                # heapq.heappop(left_heap)
                right_heap, smallest_right = remove_from_heap(right_heap, smallest_right)
                if len(left_heap) == len(right_heap):
                    median = m
                else:
                    # heapq.heappush(right_heap, m)
                    right_heap, smallest_right = push_to_max(right_heap, m)

                print_median(median, left_heap, right_heap)
            
            elif num == largest_left or num == smallest_right:
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
