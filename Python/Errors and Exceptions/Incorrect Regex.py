import re

def isValidRegex(line):
    try:
        regexp = re.compile(line)
        return True
    except:
        return False


if __name__ == '__main__':
    num = int(input())

    for i in range(num):
        line = input()
        print(isValidRegex(line))