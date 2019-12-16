import os

def solve(c):
    res = 1
    s = set(c)
    newList = {}
    for item in s:
        newList[item] = c.count(item)
    all1 = 0
    for i in range(len(c)):
        j1 = all1 - i
        if i in newList:
            j1 += newList[i] 
            all1 += newList[i]

        if j1 <= 0:
            return 0
        else:
            res *= j1

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
