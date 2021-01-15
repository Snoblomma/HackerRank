#!/bin/python3

from itertools import combinations
import math
import os
import random
import re
import sys


def find_pairs(lst):
    res = []
    for var in combinations(lst, 2):
        res.append([var[0], var[1]])

    return res


def find_chosen_one(a):
    pairs = find_pairs(a)

    for pair in pairs:
        gcd = math.gcd(pair[0], pair[1])
        non_divided = 0
        for item in a:
            if item % gcd != 0:
                non_divided += 1
        
        if non_divided == 1:
            return gcd
    
    return 0

if __name__ == '__main__':
    n = int(input())

    a = list(map(int, input().rstrip().split()))

    print(find_chosen_one(a))
