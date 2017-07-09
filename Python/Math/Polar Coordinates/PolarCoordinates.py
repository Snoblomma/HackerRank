import cmath
import re

str = input()

s = [int(x.group()) for x in re.finditer(r'[+-]?\d+', str)]

x = s[0]
y = s[1]

r = abs(complex(x, y))
phi = cmath.phase(complex(x, y))

print(r)
print(phi)
