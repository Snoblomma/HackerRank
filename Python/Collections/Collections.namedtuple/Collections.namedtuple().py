from collections import namedtuple

n = int(input())

Class = namedtuple('Class', input())

marks = 0

for item in range(n):
    s = input().split()
    xyz = Class(s[0], s[1], s[2], s[3])
    marks = marks + int(xyz.MARKS)

res= marks/n
print("%.2f" % res)
