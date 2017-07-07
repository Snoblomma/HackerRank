def happiness(s, A, B):
    A = set(A)
    B = set(B)
    
    happ = 0
    
    for item in s:
        if item in A:
            happ = happ+1
        elif item in B:
            happ = happ-1
           
    return happ

if __name__ == '__main__':
    val = input()
    n = int(val[0])
    m = int(val[0])
    s = [int(x) for x in input().split()]
    A = [int(x) for x in input().split()]
    B = [int(x) for x in input().split()]
    print(happiness(s, A, B))
