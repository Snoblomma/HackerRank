import statistics

#!/bin/python
def median(a,x):
    l = []
    for i in range(len(a)):
        op = a[i]
        num = x[i]
        if op == 'a':
            l.append(num)
        else:
            if num in l:
                l.remove(num)
                print(statistics.median(l))
            else:
                print('Wrong!')

N = int(input())
s = []
x = []
for i in range(0, N):
   tmp = input().strip().split(' ')
   a, b = [xx for xx in tmp]
   s.append(a)
   x.append(int(b))

median(s,x)