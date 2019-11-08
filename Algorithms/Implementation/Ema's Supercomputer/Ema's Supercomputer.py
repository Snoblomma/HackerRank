import os

def commonItems(li1, li2): 
    li_common = [i for i in li1 + li2 if i in li1 and i in li2] 
    return li_common 

def twoPluses(grid):
    coordinates = {1: []}
    xLen = len(grid)
    yLen = len(grid[0])

    for i in range(xLen):
        for j in range(yLen):
            if grid[i][j] == 'G':
                coordinates[1].append([[i, j]])

    for step in range(1, 8):
        prev = (step-1)*4 + 1
        current = step*4 + 1
        coordinates[current] = []
        for item in coordinates[prev]:
            x = item[0][0]
            y = item[0][1]
            if x in range(step, xLen-step) and y in range(step, yLen-step):
                if grid[x][y+step] == 'G' and grid[x][y-step] == 'G' and grid[x+step][y] == 'G' and grid[x-step][y] == 'G':
                    coordinates[current].append([[x, y], [x, y+step], [x, y-step], [x+step, y], [x-step, y]])

    for k, v in list(coordinates.items()):
        if v == []:
            del coordinates[k]

    coordinatesList = []

    for k, v in list(coordinates.items()):
        for h in v:
            coordinatesList.append([k, h])

    coordinatesList = list(reversed(coordinatesList))

    maxValue = 1

    for i in range(len(coordinatesList)):
        for j in range(i+1, len(coordinatesList)):
            if len(commonItems(coordinatesList[i][1], coordinatesList[j][1])) > 0:
                print(coordinatesList[i][0], coordinatesList[j][0])
                m = coordinatesList[i][0] * coordinatesList[j][0]
                if m > maxValue:
                    maxValue = m
    
    return maxValue

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    grid = []

    for _ in range(n):
        grid_item = input()
        grid.append(grid_item)

    result = twoPluses(grid)

    fptr.write(str(result) + '\n')

    fptr.close()
