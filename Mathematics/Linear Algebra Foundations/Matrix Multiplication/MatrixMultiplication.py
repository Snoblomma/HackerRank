import numpy

array_1 = [[1, 2], [2, 3]]
array_2 = [[4, 5], [7, 8]]

array_1 = numpy.array(array_1)
array_2 = numpy.array(array_2)
res = numpy.dot(array_1, array_2)

for item in res:
    for i in item:
        print(i)
