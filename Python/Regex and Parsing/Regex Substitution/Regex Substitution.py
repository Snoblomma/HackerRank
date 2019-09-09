import re 

def replace(line):
    line = line.rstrip('\n')
    regexp = re.compile(r'( && )|( \|\| )')

    while regexp.search(line):
        line = re.sub(r"( && )", ' and ', line)
        line = re.sub(r"( \|\| )", ' or ', line)
    
    return line

if __name__ == '__main__':
    num = int(input())

    for i in range(num):
       line = input()
       print(replace(line))