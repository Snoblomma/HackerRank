#!/bin/python3

import os

def solve(points):
    Ax = points[0][0]
    Ay = points[0][1]
    Az = points[0][2]
    Bx = points[1][0] 
    By = points[1][1]
    Bz = points[1][2]
    Cx = points[2][0]
    Cy = points[2][1]
    Cz = points[2][2]
    x = points[3][0]
    y = points[3][1]
    z = points[3][2]

    a = (By - Ay)*(Cz - Az) - (Cy - Ay)*(Bz - Az)
    b = (Bz - Az)*(Cx - Ax) - (Cz - Az)*(Bx - Ax)
    c = (Bx - Ax)*(Cy - Ay) - (Cx - Ax)*(By - Ay)
    d = (-1)*(a*Ax + b*Ay + c*Az)

    D = a*x + b*y + c*z + d

    return 'YES' if D == 0 else 'NO'

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        points = []

        for _ in range(4):
            points.append(list(map(int, input().rstrip().split())))

        result = solve(points)

        fptr.write(result + '\n')

    fptr.close()
