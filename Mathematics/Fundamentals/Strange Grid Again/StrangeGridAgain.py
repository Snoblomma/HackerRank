def solve(r, c):
    if r%2 == 0:
        return int(((r-2)/2)*10 + (c-1)*2 + 1)
    else:
        return int(((r-1)/2)*10 + (c-1)*2)

r, c = input().strip().split(' ')
r, c = [int(r), int(c)]
result = solve(r, c)
print(result)
