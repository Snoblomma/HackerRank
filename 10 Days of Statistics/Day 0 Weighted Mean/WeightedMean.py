n = int(input())

X = list(map(int, input().split()))
W = list(map(int, input().split()))
A = sum([a*b for a,b in zip(X,W)])
# or:
# A = sum(map(lambda x,y:x*y,X,W))
B = sum(W)
print(round(A/B, 1))
