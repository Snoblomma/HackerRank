n = int(input().strip())

xmin, ymin = input().strip().split(' ')
xmin, ymin = [int(xmin),int(ymin)]

for a0 in range(n-1):
    x,y = input().strip().split(' ')
    x,y = [int(x),int(y)]
    if x < xmin:
        xmin = x
    if y < ymin:
        ymin = y

print(int(xmin*ymin))
