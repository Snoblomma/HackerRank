def prime_factors(n):
    i = 2
    factors = []
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.append(i)
    if n > 1:
        factors.append(n)
    return factors
            
def is_smith_number(n):
    factors = prime_factors(n)
    s1 = sum_digits(n)
    s2 = 0
    for item in factors:
        s2 = s2 + sum_digits(item)
    
    if s1 == s2:
        return 1
    else:
        return 0
        
    
def sum_digits(n):
    s = 0
    while n:
        s += n % 10
        n //= 10
    return s

n = int(input())
print(is_smith_number(n))
