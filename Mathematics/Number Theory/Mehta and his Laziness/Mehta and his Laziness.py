import math
import os
import sys

def divisorGenerator(n):
    large_divisors = []
    for i in range(1, int(math.sqrt(n) + 1)):
        if n % i == 0:
            yield i
            if i*i != n:
                large_divisors.append(n / i)
    for divisor in reversed(large_divisors[1:]):
        yield divisor


def solve(n):
    divisors = list(divisorGenerator(n))
    square_divisors = 0
    
    for d in divisors:
        k = int(math.sqrt(d))
        if k**2 == d and d%2 == 0:
            square_divisors += 1

    if square_divisors == 0:
        return '0'
    return str(square_divisors) + '/' + str(len(divisors))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        fptr.write(result + '\n')

    fptr.close()
