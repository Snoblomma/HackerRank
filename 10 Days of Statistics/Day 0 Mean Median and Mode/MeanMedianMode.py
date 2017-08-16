import numpy
from scipy import stats

n = int(input())
A = list(map(int, input().split()))
A = numpy.array(A)
print(round(numpy.mean(A, axis = 0), 1))
print(round(numpy.median(A, axis = 0), 1))
print(round(stats.mode(A)[0][0], 1))
