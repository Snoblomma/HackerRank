import numpy

s = input().split()
N = int(s[0])
M = int(s[1])
P = int(s[2])

n_array = []
m_array = []

for i in range(N):
    k = list(map(int, input().split()))
    n_array.append(k)
    
for i in range(M):
    k = list(map(int, input().split()))
    m_array.append(k)


n_array = numpy.array(n_array)
m_array = numpy.array(m_array)
print (numpy.concatenate((n_array, m_array), axis = 0))
