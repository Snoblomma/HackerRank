import re

T = int(input())

for i in range(T):
    matches = re.finditer(r'(.([#]{1}[0-9ABCDEFabcdef]{6}).)|(.([#]{1}[0-9ABCDEFabcdef]{3}).)', input())
    
    for match in matches:
        if match.group(2) != None:
            print(match.group(2))
        if match.group(4) != None:
            print(match.group(4))
