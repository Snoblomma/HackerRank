#!/bin/python3
n = int(input().strip())

x1,y1 = input().strip().split(' ')
x1,y1 = [int(x1),int(y1)]
A = True
B = True

for a0 in range(n-1):
    x,y = input().strip().split(' ')
    x,y = [int(x),int(y)]
    if x != x1:
        A = False
    if y != y1:
        B = False

if A == False and B == False:
    print("NO")
else:
    print("YES")
