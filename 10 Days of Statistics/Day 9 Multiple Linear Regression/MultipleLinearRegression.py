from sklearn import linear_model

x = []
y = []
q = []

s = list(map(int, input().split()))
m = s[0]
n = s[1]

for i in range(n):
    line = list(map(float, input().split()))
    x.append(line[:-1])
    y.append(line[-1])
    
d = int(input())

for i in range(d):
    line = list(map(float, input().split()))
    q.append(line)
    
lm = linear_model.LinearRegression()
lm.fit(x, y)
a = lm.intercept_
b = lm.coef_

for i in q:
    print(str(round(a+i[0]*b[0] + i[1]*b[1], 2)))
