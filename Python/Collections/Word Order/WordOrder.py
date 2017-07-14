from collections import OrderedDict
d = OrderedDict()

n = int(input())

for i in range(n):
    item = input()
    if item in d:
        d[item] = d[item]+1
    else:
        d[item] = 1

print(str(len(d)))
print(' '.join(str(d[item]) for item in d))
