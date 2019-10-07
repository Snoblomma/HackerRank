import os
import math

def isPerfectSquare(x): 
    s = int(math.sqrt(x)) 
    return s*s == x 

def solve(n):
    return 'IsFibo' if isPerfectSquare(5*n*n + 4) or isPerfectSquare(5*n*n - 4) else 'IsNotFibo'


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        fptr.write(result + '\n')

    fptr.close()
