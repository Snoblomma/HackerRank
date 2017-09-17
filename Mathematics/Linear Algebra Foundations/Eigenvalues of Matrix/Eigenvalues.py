from numpy import linalg as LA

A = [[0, 1], [-2, -3]]
res = LA.eigvals(A)

print(res)
