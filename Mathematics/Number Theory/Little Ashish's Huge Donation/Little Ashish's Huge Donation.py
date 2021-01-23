#!/bin/python3

import os
import sys

def solve(x):
    i = 1
    while ((i*(i+1)*(2*i+1))/6) <= x:
        i += 1

    print(i - 1)

    # or 

    # count = 0

    # for j in range(1, x+1):
    #     x -= j*j
    #     if x < 0:
    #         break
    #     else:
    #         count += 1

    # return count
if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        solve(int(input()))
