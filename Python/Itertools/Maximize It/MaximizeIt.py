from itertools import product

st = input().split()
k = int(st[0])
m = int(st[1])

superlist = []

for i in range(k):
    l = list(map(int, input().split()[1:]))
    superlist.append(l)

k = list(product(*superlist))
      
max = 0
for item in k:
    curr = 0
    for i in item:
        curr = curr + i**2 
    
    if curr%m > max:
        max = curr%m

print(str(max))
