import os

def solve(c):
    res = 1
    print(c)
    for i in range(len(c)):
        print(i)
        j2 = [k for k in c if k <= i]
        h = len(j2) - i
        if h <= 0:
            return 0
        else:
            res *= h
        print(j2)
    print('res '+ str(res))
    return int(res%1000000007)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        c_count = int(input())

        c = list(map(int, input().rstrip().split()))

        result = solve(c)

        fptr.write(str(result) + '\n')

    fptr.close()
