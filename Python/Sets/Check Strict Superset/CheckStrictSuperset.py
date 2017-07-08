sup_s = set(map(int, input().split())) 

N = int(input())

is_superset = True

for i in range(N):
    sub = set(map(int, input().split()))
    if sup_s.issuperset(sub) is False:
        is_superset = False

print(is_superset)
