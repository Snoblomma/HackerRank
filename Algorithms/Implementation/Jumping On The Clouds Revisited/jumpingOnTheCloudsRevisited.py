n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
c = [int(c_temp) for c_temp in input().strip().split(' ')]

e = 100
point = 0

point = (point+k)%n
if c[point] == 1:
    e = e-3 
else: 
    e = e-1

while point!=0 :
    point = (point+k)%n
    if c[point] == 1:
        e = e-3 
    else: 
        e = e-1
   
print(e)
