from collections import Counter

n = int(input())
myList = input().split()
l = Counter(myList)

m = int(input())
profit = 0
for i in range(m):
    s = input().split()
    if l[s[0]] != 0:
        l[s[0]] = l[s[0]] - 1
        profit = profit + int(s[1])
    
print(profit)
