#!/bin/python3

import os
import sys

def solve(x):
    i = 1
    while ((i*(i+1)*(2*i+1))/6) <= x:
        i += 1

    print(i - 1)

if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        solve(int(input()))
