from collections import deque

t = int(input())

for i in range(t):
    n = int(input())
    d = deque(list(map(int, input().split())))
    res = "Yes"
    prev = 0
    
    if d[0] > d[-1]:
        prev = d[0]
        d.popleft()    
    else:
        prev = d[-1]
        d.pop()
    
    while len(d) > 0:
        if d[0] > d[-1]:
            curr = d[0]
            d.popleft()

        else:
            curr = d[-1]
            d.pop()
        
        
        if curr > prev:
            res = "No"
            break
        else:
            prev = curr

    print(res)    
