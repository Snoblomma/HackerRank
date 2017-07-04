def merge_the_tools(string, k):
    list = []
    
    if k != 1:
        for i in range(k):
            s = string[k*i:k*i+k]
            s = find_duplicates(s)
            print(s)
    elif k == 1:
        for item in string:
            print(item)

def find_duplicates(string):
    list = []
    for i in string:
        if i not in list:
            list.append(i)
    k = ""
    for item in list:
        k = k + item
    return k

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
