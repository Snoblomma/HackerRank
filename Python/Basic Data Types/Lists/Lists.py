if __name__ == '__main__':
    N = int(input())
    list = []
    for i in range(0, N):
        s = str(input())
        if "insert" in s:
            r = s.split(" ")
            list.insert(int(r[1]), int(r[2]))
        elif "print" in s:
            print(list)
        elif "remove" in s:
            r = s.split(" ")
            list.remove(int(r[1]))
        elif "append" in s:
            r = s.split(" ")
            list.append(int(r[1]))
        elif "sort" in s:
            list.sort()
        elif "pop" in s:
            list.pop()
        elif "reverse" in s:
            list.reverse()
