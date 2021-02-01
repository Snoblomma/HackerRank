#!/bin/python3

import math


def divisor(number):
    for i in range(2, math.ceil(math.sqrt(number))+1):
        if (number % i == 0):
            return number // i

    return 1


def breaks(n):
    if n == 1:
        return 1
    count = n
    a = n
    while a > 1:
        d = divisor(a)
        count += d
        a = d
    return count


def longestSequence(a):
    s = 0
    for item in a:
        s += breaks(item)
    return s


if __name__ == '__main__':
    n = int(input())

    a = list(map(int, input().rstrip().split()))

    result = longestSequence(a)

    print(result)
