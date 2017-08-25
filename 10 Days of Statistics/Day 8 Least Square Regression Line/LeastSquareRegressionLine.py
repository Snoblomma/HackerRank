from sklearn import linear_model
import numpy as np

x = []
y = []

for i in range(5):
    s = list(map(int, input().split()))
    x.append(s[0])
    y.append(s[1])

x = np.asarray(x).reshape(-1, 1)
lm = linear_model.LinearRegression()
lm.fit(x, y)
print(round(lm.predict(80)[0], 3))
