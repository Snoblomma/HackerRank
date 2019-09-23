#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumNumber function below.
def minimumNumber(n, password):
    addLength = 0
    add = 0

    if n < 6:
        addLength += 6 - n

    uppercase_characters = r'[A-Z]'
    lowercase_characters = r'[a-z]'
    digit_characters = r'[0-9]'
    special_characters = r'[!@#$%^&*()\-+]'

    uppercase_characters_match = bool(
        re.search(uppercase_characters, password))
    lowercase_characters_match = bool(
        re.search(lowercase_characters, password))
    digit_characters_match = bool(
        re.search(digit_characters, password))
    special_characters_match = bool(re.search(special_characters, password))

    if uppercase_characters_match == False:
        add += 1

    if lowercase_characters_match == False:
        add += 1

    if digit_characters_match == False:
        add += 1

    if special_characters_match == False:
        add += 1

    return add if add > addLength else addLength

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    password = input()

    answer = minimumNumber(n, password)

    fptr.write(str(answer) + '\n')

    fptr.close()
