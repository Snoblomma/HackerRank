from numpy import linalg as LA

M = [[3, 0, 0, -2, 4], [0, 2, 0, 0, 0], [0, -1, 0, 5, -3], [-4, 0 , 1, 0, 6], [0, -1, 0, 3, 2]]

d = LA.det(M)

print(d)
