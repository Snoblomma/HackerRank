def minDiff(a):
    m = abs(a[0]-a[1])    
    res = a[0:2]
    
    for i in range(2, len(a)):        
        s = abs(a[i]-a[i-1])      
        if s == m:
            res.append(a[i-1])
            res.append(a[i])           
        elif s < m:
            m = s
            res = a[i-1:i+1]
            
    print(*res)   

n = int(input())
a = list(map(int, input().split()))
a = sorted(a)
minDiff(a)
