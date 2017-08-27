import math
s = list(map(int, input().split()))

b = s[0]
a = s[1]

h = math.ceil(((a*2)/b))
print(h)
