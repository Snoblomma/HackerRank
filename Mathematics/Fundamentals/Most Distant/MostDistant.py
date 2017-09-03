import math
n = int(input())

xmax = 0
xmin = 0
ymax = 0
ymin = 0

for i in range(n):
    s = list(map(int, input().split()))
    x = s[0]
    y = s[1]
    if x > xmax and x != 0:
        xmax = x
    if x < xmin and x != 0:
        xmin = x
    if y > ymax and y != 0:
        ymax = y
    if y < ymin and y != 0:
        ymin = y
      
diffx = abs(xmax - xmin)
diffy = abs(ymax - ymin)
diffxy = abs(math.sqrt((xmin**2)+(ymax**2)))
diffyx = abs(math.sqrt((ymin**2)+(xmax**2)))
diff1 = abs(math.sqrt((xmin**2)+(ymin**2)))
diff2 = abs(math.sqrt((ymax**2)+(xmax**2)))

res = max(diffx, diffy, diffxy, diffyx, diff1, diff2)

print("%.6f" % res)
