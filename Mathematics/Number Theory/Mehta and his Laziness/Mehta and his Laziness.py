import math
import os
import sys

def divisorGenerator(n):
    divisors = [1]
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            divisors.append(i)
            if(n // i != i):
                divisors.append(n//i)
    divisors.sort()
    
    return divisors


def solve(n):
    divisors = divisorGenerator(n)
    square_divisors = 0
    
    for i in divisors:
        if i%2 == 0 and math.sqrt(i) == math.ceil(math.sqrt(i)):
            square_divisors += 1

    if square_divisors == 0:
        return '0'
    return str(square_divisors) + '/' + str(len(divisors))

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        # fptr.write(result + '\n')
        print(result)

    # fptr.close()
