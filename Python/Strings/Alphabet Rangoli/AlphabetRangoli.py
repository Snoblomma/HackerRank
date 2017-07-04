import string

def print_rangoli(size):
    
    # building list of letters
    list = []
    
    for i in range(size):
        s = [string.ascii_letters[size-j-1] for j in range(i+1)]
        d = s[::-1]
        s = s[:-1] + d
        list.append(s)
        #print(s)

    # top rows
    for i in range(size-1):
        s = list[i]
        k = ""
        for l in s:
            k = k + "-" + l
        print(((size-i-1)*2-1)*"-"+ k +(size-i-1)*2*"-")
    
    # middle row
    s = list[len(list)-1]
    k = ""
    for l in s:
        k = k + "-" + l
    k = k[1:]
    print(k)
    
    # bottom rows
    for i in range(1, size):
        s = list[size-i-1]
        k = ""
        for l in s:
            k = k + "-" + l
        print(((i)*2-1)*"-"+ k +(i)*2*"-") 
    
if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
