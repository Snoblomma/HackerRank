from collections import deque

n = int(input())
d= deque()
for i in range(n):
    s = input()
    if "popleft" in s:
        d.popleft()
    elif "pop" in s:
        d.pop()
    elif "appendleft" in s:
        a = s.split()[1]
        d.appendleft(a)
    elif "append" in s:
        a = s.split()[1]
        d.append(a)
        
print(' '.join(str(item) for item in d))
