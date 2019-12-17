import os
import copy

def solve(c):
    res = 1
    print(c)
    csorted = copy.deepcopy(sorted(c))
    print(csorted)
    lasts = [1]

    last = 1


    for i in range(1, len(csorted)):
        if csorted[i] > i:
            return 0
        elif csorted[i-1] == csorted[i]:
            last += 1
        res = res * last
        lasts.append(last)
    print('LASTs')
    print(lasts)

    return int(res%1000000007)
    # return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        c_count = int(input())

        c = list(map(int, input().rstrip().split()))

        result = solve(c)

        fptr.write(str(result) + '\n')

    fptr.close()
