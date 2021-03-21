#!/bin/python3

import os
import sys

def matching(a, b):
    miss = 0
    for i in range(len(a)):
        if a[i] != b[i]:
            miss += 1
            if miss > 1:
                return False
    
    return True if miss <= 1 else False

def virusIndices(p, v):
    k = len(v)
    matches = []
    for i in range(len(p) - k + 1):
        sub = p[i:i+k]
        if matching(sub, v):
            matches.append(i)

    print(' '.join(map(str, matches)) if len(matches) > 0 else 'No Match!')


if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        pv = input().split()
        p = pv[0]
        v = pv[1]
        virusIndices(p, v)
