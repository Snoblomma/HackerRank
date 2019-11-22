def text(a):
    s = ''
    states = [s]
    for item in a:
        action = int(item[0])
        if action == 1:
            s += item[1]
            states.append(s)
        elif action == 2:
            k = int(item[1])
            s = s[:-k]
            states.append(s)
        elif action == 3:
            k = int(item[1])
            print(s[k-1])
        elif action == 4:
            states.pop()
            s = states[-1]

if __name__ == '__main__':
    q = int(input())
    a = []
    for i in range(q):
        a.append(list(input().rstrip().split()))
    text(a)