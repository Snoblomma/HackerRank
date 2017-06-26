#!/bin/python3

import sys

def solve(year):
    is_leap = False
    # checking if year is leap:
    if year == 1918:
        return "26.09.1918"
    
    else:
        if year < 1918:
            if year%4 == 0:
                is_leap = True        
        elif year > 1918:
            if year%400 == 0 or (year%4 == 0 and year%100 !=0):
                is_leap = True
    
    if is_leap == True:
        return "12.09." + str(year)
        
    elif is_leap == False:
        return "13.09." + str(year)

year = int(input().strip())
result = solve(year)
print(result)
