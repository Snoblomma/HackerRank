def text(a):
    s = ''
    prev = []
    for item in a:
        action = int(item[0])
        if action == 1:
            prev.append(s)
            k = item[1]
            s += k
        elif action == 2:
            prev.append(s)
            k = int(item[1])
            s = s[:-k]
        elif action == 3:
            k = int(item[1])            
            print(s[k-1])
        elif action == 4:
            s = prev[-1]
            prev = prev[:-1]    

if __name__ == '__main__':
    q = int(input())
    a = []
    for i in range(q):
        a.append(list(input().rstrip().split()))
    text(a)