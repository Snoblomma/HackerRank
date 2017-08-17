from itertools import chain

def get_median(n, X):
    if n%2 == 0:
        m = int((X[int(n/2)] + X[int(n/2)-1])/2)
    elif n%2 ==1:
        m = X[int(len(X)/2)]  
    return m


n = int(input())
X = list(map(int, input().split()))
F = list(map(int, input().split()))

l = [[a]*b for a,b in zip(X,F)]
l = list(chain.from_iterable(l))
l.sort()

low = 0
up = 0

lower = l[:int(len(l)/2)]
upper = l[int(len(l)/2+len(l)%2):]
    
low = get_median(len(lower), lower)
up = get_median(len(upper), upper)
    
print(float(up-low))
