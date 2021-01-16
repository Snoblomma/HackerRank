#!/bin/python3

import math
import os
import sys


def find_chosen_one(a, n):
    pre = [0]*10000000
    suf = [0]*10000000

    if n == 1:
        return a[0]+1

    for i in range(n):
        pre[i+1] = math.gcd(a[i], pre[i])

    for j in range(n, 0, -1):
        suf[j] = math.gcd(suf[j+1], a[j-1])

    for i in range(1, n+1):
        gcd = math.gcd(pre[i-1], suf[i+1])
        if a[i-1] % gcd != 0:
            return gcd


if __name__ == '__main__':
    n = int(input())

    a = list(map(int, input().rstrip().split()))

    print(find_chosen_one(a, len(a)))
