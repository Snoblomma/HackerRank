#!/bin/python3

import os
import sys
import re

def solve(n):
    regex_pattern = r"^[9]+([0|9]*)*$"
    k = n
    while re.search(regex_pattern, str(k)) == None:
        k += n
    return str(k)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        fptr.write(result + '\n')

    fptr.close()
