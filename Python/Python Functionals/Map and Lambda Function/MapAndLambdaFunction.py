cube = lambda x: x*x*x

def fibonacci(n):
    if n == 0:
        return[]
    elif n == 1:
        return [0]
    elif n ==2:
        return [0, 1]
    else:
        l = [0, 1]
        for i in range(n-2):
            l.append(l[-1]+l[-2])
        return l
    
if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))
