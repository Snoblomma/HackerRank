import math

def closest_number(a, b, x):
    s = a**b 
    c = int(s/x)
    p = math.fabs(s-c*x)
    n = math.fabs(s-(c+1)*x)
    if p <= n:
        return int(c*x)
    elif p > n:
        return int((c+1)*x)

n = int(input())
for i in range(n):
    s = list(map(int, input().split())) 
    print(closest_number(s[0], s[1], s[2]))
