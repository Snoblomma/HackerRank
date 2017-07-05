def symmetrical_diff(N, M):
    n = set()
    m = set()
    for item in N:
        n.add(item)
    for item in M:
        m.add(item)
        
    d1 = n.difference(m)
    d2 = m.difference(n)
    res = d1.union(d2)
    b = list(res)
   
    for i in range(len(b)):
        b[i] = int(b[i])

    b.sort()
    
    for item in b:
        print(item)    

if __name__ == '__main__':
    n = int(input())
    N = set()
    N = input().split()
    m = int(input())
    M = input().split()
    symmetrical_diff(N, M)
