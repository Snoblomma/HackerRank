import numpy

array_1 = [[1, 2, 3], [2, 3, 4], [1, 1, 1]]
array_2 = [[4, 5, 6], [7, 8, 9], [4, 5, 7]]


array_1 = numpy.array(array_1)
array_2 = numpy.array(array_2)
res = numpy.add(array_1, array_2)
print (array_1)
print (array_2)
print(res)

for item in res:
    for i in item:
        print(i)
