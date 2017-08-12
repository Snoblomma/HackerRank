import numpy

s = list(map(int, input().split()))

n = s[0]
m = s[1]

print(numpy.eye(n, m, k = 0) )
