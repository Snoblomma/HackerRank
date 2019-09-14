a = input()
a = sorted(a, key=(lambda x: (x[0].isdigit(), x[0].isdigit() and int(x[0])%2==0, x[0].isupper(), x[0])))
print(*a, sep='')