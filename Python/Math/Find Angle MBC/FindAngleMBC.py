import math

AB = int(input())
BC = int(input())

AC = math.sqrt(AB**2 + BC**2)
MC = AC/2
BM = MC
s = (BM**2+BC**2-MC**2)/(2*BM*BC)
phi = math.degrees(math.acos(s))
degree_sign= u'\N{DEGREE SIGN}'
print (str(str(round(phi))) + degree_sign)
