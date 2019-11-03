import re

def print_matrix(matrix, n, m):
    res = ''
    for m1 in range(m):
        for n1 in range(n):
            res += matrix[n1][m1]

    line = re.sub(r"(?<=[a-zA-Z\d]{1})([^a-zA-Z\d]+)(?=[a-zA-Z\d]{1})", " ", res)
    print(line)

first_multiple_input = input().rstrip().split()

n = int(first_multiple_input[0])

m = int(first_multiple_input[1])

matrix = []

for _ in range(n):
    matrix_item = input()
    matrix.append(matrix_item)

print_matrix(matrix, n, m)