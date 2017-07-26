import re

matches = re.finditer(r'(?=[^aeiouAEIOU]+([aeiouAEIOU]{2,})[^aeiouAEIOU]+)', input())

results = {}
list = []
for match in matches:
    results[match.start(1)] = match.group(1) 
    if match.start(1) not in list:
        list.append(match.start(1))

if len(results) == 0:
    print(-1)
else:
    for item in list:
        print(results[item])
