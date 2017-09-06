q = int(input())

for i in range(q):
    n,m = input().split()
    
    try:
        print(int(int(n)/int(m)))
    except ZeroDivisionError as e:
        print ("Error Code:",e)
    except ValueError as e:
        print ("Error Code:",e)
