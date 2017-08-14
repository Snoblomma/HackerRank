import re

n = list(map(int, input().split()))

s = ""

for i in range(n[0]):
    k = input()
    for l in range(n[1]-len(k)):
        k = k + " "

    for j in range(n[1]):   
        
        index = i*j+i+j     
        s = s[:index] + k[j] + s[index:]
        
        
matches = re.finditer(r'\(?([0-9A-Za-z]+)\)?', s)
#TODO: improve sub
#f = re.search(r'\(?([0-9A-Za-z]+)\)?', s).start(0)
#sub = s[:f]
sub = ""

top = 0
l = []

for match in matches:
    l.append(match.group(1))
    top = match.end(1)

d = sub+ " ".join(match for match in l) + s[top:]
print(d)
