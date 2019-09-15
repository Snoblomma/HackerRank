import re

T = int(input())

for i in range(T):
    s = input()
    m = bool(re.search(r'^([789]{1}[0-9]{9})$', s))
    if m == True:
        print("YES")
    else:
        print("NO")
