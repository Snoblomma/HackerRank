a = int(input()); A = set(input().split()) 
t = int(input())

for test in range(t):
    b = input(); 
    B = set(input().split())   
    if "intersection" in b:
        A.intersection_update(B)
    elif "symmetric" in b:
        A.symmetric_difference_update(B)
    elif "difference" in b:
        A.difference_update(B)
    elif "update" in b:
        A.update(B)
sum = 0
for i in A:
    sum = sum + int(i)
    
print(str(sum))
