import os
import math

def solve(n, operations):
    r = 0

    for o in operations:
        r += (int(o[1]) - int(o[0]) + 1)*int(o[2])
        print(r)

    return math.floor(r/n)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    operations = []

    for _ in range(m):
        operations.append(list(map(int, input().rstrip().split())))

    result = solve(n, operations)

    fptr.write(str(result) + '\n')

    fptr.close()
