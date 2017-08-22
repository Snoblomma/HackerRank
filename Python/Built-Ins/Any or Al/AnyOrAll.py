n = int(input())
s = list(map(int, input().split()))
print(True if all(x > 0 for x in s) == True and any(str(x) == str(x)[::-1] for x in s) == True else False)
