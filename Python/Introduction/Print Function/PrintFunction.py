if __name__ == '__main__':
    n = int(input())
    k = 0
    for i in range(1, n+1):
        p = pow(10, (len(str(i))))
        k = k*p+i

    print(k)
