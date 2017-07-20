from itertools import combinations

inp = input().split()
word = inp[0]
word = ''.join(sorted(word))
k = int(inp[1])

for t in range(1, k+1):
    s = list(combinations(word, t))
    s.sort()
    for item in s:
        print("".join(str(i) for i in item))
