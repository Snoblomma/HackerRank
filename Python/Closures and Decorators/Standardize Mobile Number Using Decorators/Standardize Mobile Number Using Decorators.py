def format(l):
    s = list()
    for item in l:
        n1=item[-10:-5]
        n2=item[-5:]
        item = f"+91 {n1} {n2}"
        s.append(item)
    return s

def wrapper(f):
    def fun(l):
        ret=f(format(l))
        return ret
    return fun

@wrapper
def sort_phone(l):
    print(*sorted(l), sep='\n')

if __name__ == '__main__':
    l = [input() for _ in range(int(input()))]
    sort_phone(l) 