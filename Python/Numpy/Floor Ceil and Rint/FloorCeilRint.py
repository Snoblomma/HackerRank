import numpy

my_array = numpy.array(list(map(float, input().split())))
   
print (numpy.floor(my_array))
print (numpy.ceil(my_array))
print (numpy.rint(my_array))
