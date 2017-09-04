import functools
import math

def get_leonardo_primes(number):
    mult = 1    
    count = 0
    for n in range(1,number+1):
        status = True
        if n < 2:
            status = False
        else:
            for i in range(2,n):
                if n % i == 0:
                    status = False
        
        if status == True:
            mult = mult * n
            if mult == number:
                return count + 1
            elif mult > number:
                return count
            else:
                count = count + 1            
    
    return count    

q = int(input())

for i in range(q):
    n = int(input())
    print(get_leonardo_primes(n))
