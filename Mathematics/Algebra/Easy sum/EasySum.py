for i in range(int(input())):
    n,m = list(map(int, input().split()))
    
    magic = int((m*(m-1))/2)
    n1 = int(n/m)
    n2 = n%m
    n3 = int((n2*(n2-1))/2)
    print((n1*magic) + n3 + n2)
