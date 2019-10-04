import os
import sys

def solve(a, b, k, m):
    def mult(a,b):
        return ((a[0]*b[0]-a[1]*b[1])%m, (a[0]*b[1]+a[1]*b[0])%m)

    x=(a,b)
    P=(1,0)
    while k:
        if k%2:
            P=mult(P,x)
        k//=2
        x=mult(x,x)
    return P


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        abkm = input().split()

        a = int(abkm[0])

        b = int(abkm[1])

        k = int(abkm[2])

        m = int(abkm[3])

        result = solve(a, b, k, m)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
