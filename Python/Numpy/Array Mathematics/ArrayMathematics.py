import numpy

s = list(map(int, input().split()))

n = s[0]
m = s[1]

a = []
b = []

for i in range(n):
    k = list(map(int, input().split()))
    a.append(k)
    
for i in range(n):
    k = list(map(int, input().split()))
    b.append(k)

a = numpy.array(a)
b = numpy.array(b)

print(str(numpy.array(numpy.add(a, b), int)))
print(str(numpy.array(numpy.subtract(a, b), int)))   
print(str(numpy.array(numpy.multiply(a, b), int)))
print(str(numpy.array(numpy.divide(a, b), int)))
print(str(numpy.array(numpy.mod(a, b), int)))
print(str(numpy.array(numpy.power(a, b), int)))
