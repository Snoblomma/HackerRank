def print_formatted(number):
    s = len('{:b}'.format(number)) + 1
    s1 = len(str(number)) + 1
    for i in range(1, number+1):
        k = str(i).rjust(s-1) + '{:o}'.format(i).rjust(s) + '{:x}'.format(i).upper().rjust(s)+ '{:b}'.format(i).rjust(s)
        print(k)
