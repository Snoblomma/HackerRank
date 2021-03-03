#!/bin/python3

import math
import os
import random
import re
import sys

def matchingStrings(strings, queries):
    res = []
    print(strings)
    for q in queries:
        if q in strings:
            res.append(strings[q])
        else:
            res.append(0)
    return res


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    strings_count = int(input())

    strings = {}

    for _ in range(strings_count):
        key = input()
        if key in strings:
            strings[key] += 1
        else:
            strings[key] = 1

    queries_count = int(input())

    queries = []

    for _ in range(queries_count):
        queries_item = input()
        queries.append(queries_item)

    res = matchingStrings(strings, queries)

    fptr.write('\n'.join(map(str, res)))
    fptr.write('\n')

    fptr.close()
