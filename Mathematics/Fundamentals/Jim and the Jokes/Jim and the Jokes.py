import os
import string
digs = string.digits + string.ascii_uppercase

def removeInvalid(dates: []):
    newDates = []
    for date in dates:
        if belongsToBase(date[1], date[0]):
            newDates.append(date)
    return newDates

def belongsToBase(x, base):
    for i in str(x):
        if i not in digs[0:base]:
            return False

    return True

def numberToDec(x, base):
    if base == 10:
        return x
    else:
        n = len(str(x)) - 1
        res = 0
        for k in str(x):
            s = digs.index(k)*(base**n)
            n -= 1
            res += s
        return res


def solve(dates):
    res = 0
    dates = removeInvalid(dates)

    if len(dates) > 0:
        k = []
        for date in dates:
            k.append(numberToDec(date[1], date[0]))

        s = set(k)

        for item in s:
            c = k.count(item)
            if c > 1:
                pairs = c*(c-1)/2
                res += pairs
 
    return int(res)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    dates = []

    for _ in range(n):
        dates.append(list(map(int, input().rstrip().split())))

    result = solve(dates)

    fptr.write(str(result) + '\n')

    fptr.close()
