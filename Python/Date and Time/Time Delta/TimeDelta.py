from datetime import datetime

t = int(input())

for i in range(t):
    convdate=input()
    a = datetime.strptime(convdate, "%a %d %b %Y %H:%M:%S %z")
    
    convdate2=input()
    b = datetime.strptime(convdate2, "%a %d %b %Y %H:%M:%S %z")
    
    print(round(abs((b-a).total_seconds())))
