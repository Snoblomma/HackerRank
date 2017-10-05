def minimal(B, N):
    count = 0
    for i in range(N):
        if i==N-1:
            if B[i]%2==1 and B[i-1]==1:
                B[i]+=1
                B[i-1]+=1
                count+=2
            elif B[i]%2==1 and B[i-1]%2==0:
                return "NO"
        elif B[i]%2==1:
            B[i]+=1
            B[i+1]+=1
            count+=2
    return count
    
N = int(input().strip())
B = [int(B_temp) for B_temp in input().strip().split(' ')]

countOdd = 0

for item in B:
    if item%2==1:
        countOdd+=1
        
if countOdd%2==1:
    print("NO")
else:
    print(minimal(B, N))
