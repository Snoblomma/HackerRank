from collections import defaultdict
d = defaultdict(list)
l = []

s = input().split()

n = int(s[0])
m = int(s[1])

for i in range(n):
    item = input()
    d[item].append(i+1)
    
for i in range(m):
    item = input()
    l.append(item)

for item in l:
    if item in d:
        print(' '.join(str(x) for x in d[item]))
    else:
        print(-1)
