import numpy

n = int(input())
A = []

for i in range(n):
    A.append(list(map(float, input().split())))

A = numpy.array(A)

print(numpy.linalg.det(A))
