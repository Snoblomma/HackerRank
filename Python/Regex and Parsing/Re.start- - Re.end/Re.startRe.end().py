import re

S = input()
k = input()

matches = re.finditer(r'(?=('+k+'))', S)

results = []

for match in matches:
    results.append((match.start(1), match.end(1)-1))


if len(results) == 0:
    print("(-1, -1)")
else:
    for item in results:
        print(item)
