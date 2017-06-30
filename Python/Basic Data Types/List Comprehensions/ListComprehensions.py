if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())

    # using for loop
    lists = []    
    for i in range(x+1):
        for j in range(y+1):
            for k in range(z+1):
                arr = [i, j, k]
                if sum(arr) != n:
                  lists.append([i,j,k])
    lists.sort()
    
    # same thing, but using list comprehensions:    
    lists2 = [[i, j, k] for i in range(x+1) for j in range(y+1) for k in range(z+1) if sum([i, j, k]) != n] 
    lists2.sort()

    print(lists)
    print(lists2)
