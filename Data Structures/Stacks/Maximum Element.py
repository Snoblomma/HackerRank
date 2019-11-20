def maxElement(a):
    res = []
    maxEl = 0
    for item in a:
        if item[0] == 1:
            el = item[1]
            res.append(el)
            if el > maxEl:
                maxEl = el
        elif item[0] == 2:
            # res = res[1::]
            del res[-1]
        elif item[0] == 3:
            print(max(res))
        # print(res)

if __name__ == '__main__':
    q = int(input())
    a = []
    for i in range(q):
        a.append(list(map(int, input().rstrip().split())))
    maxElement(a)