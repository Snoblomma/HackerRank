from itertools import product

A = list(map(int, input().split(" ")))
B = list(map(int, input().split(" ")))

res = list(product(A, B))
print(' '.join(str(item) for item in res))
