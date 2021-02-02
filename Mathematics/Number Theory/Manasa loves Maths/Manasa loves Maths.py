#!/bin/python3

import os
import sys

combos8 = ['16', '24', '23', '04', '48', '56', '46', '27', '08', '88', '69']
combos4 = ['00','02','04','06','08','12','16','23','24','27','28','29','36','44','46','48','52','56','67','68','69','88']

def divisible_by_4(a1, a2, n):
    index1 = n.find(a1)
    if index1 == -1:
        return False
    else:
        test = n.replace(a1, '')
        index2 = test.find(a2)
        if index2 == -1:
            return False
        else: 
            l = a1 + a2
            if l in combos8:
                return True
            else:
                t = test.replace(a2, '')
                if t == '0':
                    return False
                else:
                    return True


def divisible_by_8(a1, a2, n):
    index1 = n.find(a1)
    if index1 == -1:
        return False
    else:
        test = n.replace(a1, '')
        index2 = test.find(a2)
        if index2 == -1:
            return False
        else:
            return True


def solve(n):
    if len(n) == 1:
        if n == '8':
            return 'YES'
        return 'NO'

    if len(n) == 2:
        for c in combos8:
            if divisible_by_8(c[0], c[1], n):
                return 'YES'

    else:
        for c in combos4:
            if divisible_by_4(c[0], c[1], n):
                return 'YES'

    return 'NO'


if __name__ == '__main__':

    t = int(input())

    for t_itr in range(t):
        n = input()

        result = solve(n)

        print(result)
