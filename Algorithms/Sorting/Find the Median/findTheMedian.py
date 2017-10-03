n = int(input())
c = sorted([int(c_temp) for c_temp in input().strip().split(' ')])

if n%2 == 0:
    print((c[int(n/2)]+c[int(n/2)-1])/2)

else:
    print(c[int(n/2)])
