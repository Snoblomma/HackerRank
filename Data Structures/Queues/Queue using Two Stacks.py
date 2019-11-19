def queue(a):
    res = []
    for item in a:
        if item[0] == 1:
            res.append(item[1])
        elif item[0] == 2:
            res = res[1::]
        elif item[0] == 3:
            print(res[0])

if __name__ == '__main__':
    q = int(input())
    a = []
    for i in range(q):
        a.append(list(map(int, input().rstrip().split())))
    queue(a)