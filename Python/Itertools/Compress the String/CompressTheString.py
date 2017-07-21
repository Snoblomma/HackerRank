from itertools import groupby

w = list(input())

k = [(len(list(cgen)), int(c)) for c,cgen in groupby(w)]
print(" ".join(str(item) for item in k))
