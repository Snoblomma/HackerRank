import re
m = re.findall(r'(([0-9a-zA-Z])\2{1,})', input())

if len(m)!=0:
    print( m[0][1])    
else:
    print("-1")
