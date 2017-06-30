if __name__ == '__main__':
    students = {}

    for _ in range(int(input())):
        name = input()
        score = float(input())
        students[name] = score       

    l = list(students.values())
    s = set(l)
    l2 = list(s)
    l2.sort()
    
    find = l2[1]
    
    list_res = []
    
    for s in students:
        if students[s] == find:
            list_res.append(s)

    list_res.sort()
    
    for item in list_res:
        print(item)
