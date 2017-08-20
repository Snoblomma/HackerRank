s = list(map(int, input().split()))
zipped_list = []

for i in range(s[1]):
    k = list(map(float, input().split()))
    zipped_list.append(k)

res = [sum(item)/s[1] for item in zip(*zipped_list)]
for item in res:
    print(round(item, 1))
