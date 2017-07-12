k = int(input()); 
A = list(input().split()) 
A.sort()

pos = -1

for item in range(0, len(A)-k, k):
    if int(A[item])-int(A[item+k-1]) is not 0:
        pos = item
        break
    
print(A[pos])
