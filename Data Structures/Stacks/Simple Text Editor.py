def text(a):
    s = ''
    prev = []
    for item in a:
        action = int(item[0])
        if action == 1:
            k = item[1]
            prev.append([1, len(k)])
            s += k
        elif action == 2:
            k = int(item[1])
            first = s[:-k]
            second = s[(len(s)-k):]
            prev.append([2, second])
            s = first
        elif action == 3:
            k = int(item[1])
            print(s[k-1])
        elif action == 4:
            a1 = prev[-1][0]
            a2 = prev[-1][1]
            if a1 == 1:
                s = s[:-a2]
            elif a1 == 2:
                s = s + a2
            prev = prev[:-1]

if __name__ == '__main__':
    q = int(input())
    a = []
    for i in range(q):
        a.append(list(input().rstrip().split()))
    text(a)