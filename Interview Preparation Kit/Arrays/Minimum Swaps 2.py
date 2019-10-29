import os

def minimumSwaps(arr):
    N = len(arr)
    positions = [*enumerate(arr)] 
    positions.sort(key = lambda it:it[1]) 
    visited = {k:False for k in range(N)} 

    res = 0
    for i in range(n): 
        if visited[i] or positions[i][0] == i: 
            continue
            
        cycleSize = 0
        j = i 
        while not visited[j]: 
            visited[j] = True
            j = positions[j][0] 
            cycleSize += 1

        if cycleSize > 0: 
            res += (cycleSize - 1) 

    return res 

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = minimumSwaps(arr)

    fptr.write(str(res) + '\n')

    fptr.close()
