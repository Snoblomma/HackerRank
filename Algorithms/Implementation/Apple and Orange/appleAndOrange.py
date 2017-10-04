s,t = input().strip().split(' ')
s,t = [int(s),int(t)]
a,b = input().strip().split(' ')
a,b = [int(a),int(b)]
m,n = input().strip().split(' ')
m,n = [int(m),int(n)]
apples = [int(apple_temp) for apple_temp in input().strip().split(' ')]
oranges = [int(orange_temp) for orange_temp in input().strip().split(' ')]

min = min(s, t)
max = max(s, t)

app = 0
orr = 0
for apple in apples:
    k = apple + a
    if k >= min and k <= max:
        app = app + 1
    
for orange in oranges:
    k = orange + b
    if k >= min and k <= max:
        orr = orr + 1
    
print(app)
print(orr)
