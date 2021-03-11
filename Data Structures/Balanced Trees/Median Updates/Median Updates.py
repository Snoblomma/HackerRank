#!/bin/python

import statistics
import heapq


def print_median(median, largest, smallest):
    if median != None:
        print(median)
    else:
        print((largest + smallest) / 2)

def remove_from_left(left_heap, largest_left):
    left_heap.remove(largest_left)
    largest_left = max(left_heap)
    return left_heap, largest_left 

def remove_from_right(right_heap, smallest_right):
    right_heap.remove(smallest_right)
    smallest_right = min(right_heap)
    return right_heap, smallest_right

def push_to_left(left_heap, m):
    left_heap.append(m)
    largest_left = max(left_heap)
    return left_heap, largest_left

def push_to_right(right_heap, m):
    right_heap.append(m)
    smallest_right = min(right_heap)
    return right_heap, smallest_right

def median(a, x):
    l = []
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
                left_heap, largest_left = remove_from_left(left_heap, largest_left)
                if len(left_heap) == len(right_heap):
                    median = m
                else:
                    left_heap, largest_left = push_to_left(left_heap, m)
                
                print_median(median, left_heap, right_heap)

            elif num > smallest_right:
                m = smallest_right
                right_heap, smallest_right = remove_from_right(right_heap, smallest_right)
                if len(left_heap) == len(right_heap):
                    median = m
                else:
                    right_heap, smallest_right = push_to_right(right_heap, m)

                print_median(median, left_heap, right_heap)
            
            elif num == largest_left or num == smallest_right:
                median = num
                print(median)

        else:
            if num <= largest_left:
                left_heap, largest_left = remove_from_left(left_heap, num)
                print_median(median, left_heap, right_heap)
        
            elif num >= smallest_right:
                right_heap, smallest_right = remove_from_right(right_heap, num)
                print_median(median, left_heap, right_heap)

            elif num == median:
                print(median)
                median = None

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
