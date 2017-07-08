n = int(input())
s = set(map(int, input().split())) 

N = int(input())
for i in range(N):
    line = input()
    if "pop" in line:
        s.pop()
    elif "remove" in line:
        k = int(line.split(" ")[1])
        s.remove(k)
    elif "discard" in line:
        k = int(line.split(" ")[1])
        s.discard(k)
        
print(sum(s))
