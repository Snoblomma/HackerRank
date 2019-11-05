import os

def formingMagicSquare(s):
    n = len(s)
    M = n*(n**2+1)/2
    print(n)
    print(M)
    middle = abs(5-s[1][1])
    
    s[1][1] = 5

    h = []
    v = []
    for i in range(n):
        h1 = 0
        for j in range(n):
            h1 += s[i][j]
        h.append(h1)

    for j in range(n):
        v1 = 0
        for i in range(n):
            v1 += s[i][j]
        v.append(v1)
    
    hDiff = 0
    vDiff = 0
    for item in h:
        hDiff += abs(item - M)
    for item in v:
        vDiff += abs(item - M)
    hDiff += middle
    vDiff += middle
    print(hDiff)
    print(vDiff)
    return int(max(hDiff, vDiff))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = []

    for _ in range(3):
        s.append(list(map(int, input().rstrip().split())))

    result = formingMagicSquare(s)

    fptr.write(str(result) + '\n')

    fptr.close()
