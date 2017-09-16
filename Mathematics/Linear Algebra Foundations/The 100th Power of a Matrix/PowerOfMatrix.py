from numpy import linalg as LA

A = [[1, 1, 0], [0, 1, 0], [0, 0, 1]]
res = LA.matrix_power(A, 100)

print(res)
