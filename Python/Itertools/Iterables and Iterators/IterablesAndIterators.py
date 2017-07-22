from itertools import combinations

n = int(input())
l = list(input().split())
k = int(input())

s = list(combinations(l, k))

count = 0
size = len(s)

for item in s:
    if "a" in item:
        count = count+1
        
r = count/size
print("{0:.4f}".format(r))
