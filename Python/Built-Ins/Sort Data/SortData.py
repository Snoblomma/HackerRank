import operator
s = list(map(int, input().split()))

n = s[0]
m = s[1]
table = []
for i in range(n):
    line = list(map(int, input().split()))
    table.append(line)
  
k = int(input())
table.sort(key=operator.itemgetter(k))
for item in table:
    print(*item, sep=' ')
