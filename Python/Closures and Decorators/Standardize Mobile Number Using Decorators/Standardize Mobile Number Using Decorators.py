def format(l):
    number_list = list()
    for item in l:
        n1=item[-10:-5]
        n2=item[-5:]
        number = f"+91 {n1} {n2}"
        number_list.append(number)
    return number_list

def wrapper(f):
    def fun(l):
        number_list=f(format(l))
        return number_list
    return fun

@wrapper
def sort_phone(l):
    print(*sorted(l), sep='\n')

if __name__ == '__main__':
    l = [input() for _ in range(int(input()))]
    sort_phone(l) 