#!/bin/python3

import math
import os
import random
import re
import sys

def sumOfGroup(k):
    return k**3

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    k = int(input())

    answer = sumOfGroup(k)

    fptr.write(str(answer) + '\n')

    fptr.close()
