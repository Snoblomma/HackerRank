import os
import sys
import string
digs = string.digits + string.ascii_uppercase


def removeInvalid(dates: []):
    newDates = []
    for date in dates:
        base = date[0]
        d = date[1]
        if belongsToBase(d, base):
            newDates.append(date)
    return newDates

def belongsToBase(x, base):
    r = digs[0:base]
    for i in str(x):
        if i not in r:
            return False

    return True

def numberToDec(x, base):
    n = len(str(x)) - 1
    res = 0
    for k in str(x):
        s = digs.index(k)*(base**n)
        n -= 1
        res += s
    return res

def decimalToBase(x, base):
    digits = []

    while x:
        digits.append(digs[int(x % base)])
        x = int(x / base)

    digits.reverse()

    return ''.join(digits)


def solve(dates):
    res = 0
    dates = removeInvalid(dates)

    if len(dates) > 0:

        for i in range(len(dates)):
            for j in range (i + 1, len(dates)):
                base1 = dates[i][0]
                number1 = dates[i][1]
                base2 = dates[j][0]
                number2 = dates[j][1]
                num1ToDec = numberToDec(number1, base1)
                num2ToDec = numberToDec(number2, base2)
                if (num1ToDec == num2ToDec):
                    res += 1

    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    dates = []

    for _ in range(n):
        dates.append(list(map(int, input().rstrip().split())))

    result = solve(dates)

    fptr.write(str(result) + '\n')

    fptr.close()
