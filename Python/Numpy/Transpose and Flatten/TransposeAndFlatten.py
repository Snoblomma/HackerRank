import numpy

s = input()

my_array = []

for i in range(int(s[0])):
    k = list(map(int, input().split()))
    my_array.append(k)


my_array = numpy.array(my_array)
print (numpy.transpose(my_array))
print (my_array.flatten())
