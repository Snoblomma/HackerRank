import numpy

s = list(map(int, input().split()))
n = s[0]

k = []

for i in range(n):
    k.append(list(map(int, input().split())))

k = numpy.array(k)
print(numpy.max(numpy.min(k, axis = 1)))
