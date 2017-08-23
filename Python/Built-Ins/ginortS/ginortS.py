a = input()

a = sorted(a, key=(lambda x: (int(x[0]), x[0].isupper(), x)))
print(*a, sep='')
