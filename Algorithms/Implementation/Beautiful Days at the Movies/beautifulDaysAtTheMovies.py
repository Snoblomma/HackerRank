def isBeautiful(s, k):
    rev = str(s)[::-1]
    h = s - int(rev)
    if h%k ==0:
        return True
    else:
        return False

i, j, k = list(map(int, input().split()))
count = 0 

for s in range(i, j+1):
    if isBeautiful(s, k):
        count+=1
        
print(count)
