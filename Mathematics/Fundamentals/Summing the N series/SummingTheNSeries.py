t = int(input())

for i in range(t):
    n = int(input())
    n = n%((10**9) + 7)
        
    k = 0 if n%2 == 0 else int((n+1)/2)
    one = ((((n+1)%((10**9) + 7))*(int(n/2)))+k)%((10**9) + 7)
        
    one = one%((10**9) + 7) 
    s = (2*one - n)%((10**9) + 7)
    print(s)
