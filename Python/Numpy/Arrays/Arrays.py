import numpy

def arrays(arr):
    A = numpy.array(arr, float)
    return A[::-1]
    
arr = input().strip().split(' ')
result = arrays(arr)
print(result)
