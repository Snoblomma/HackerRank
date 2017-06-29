if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    t = list(arr)
    s = set(t)
    a = list(s)  
    a.sort()
    print(a[-2])
