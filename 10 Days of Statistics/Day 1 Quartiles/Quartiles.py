def get_median(n, X):
    if n%2 == 0:
        m = int((X[int(len(X)/2)] + X[int(len(X)/2)-1])/2)
    elif n%2 ==1:
        m = X[int(len(X)/2)]  
    return m


n = int(input())
X = list(map(int, input().split()))
X.sort()

m = 0
low = 0
up = 0

m = get_median(n, X)
lower = X[:int(n/2)]
upper = X[int(n/2+n%2):]
    
low = get_median(len(lower), lower)
up = get_median(len(upper), upper)
    
print(low)
print(m)
print(up)
