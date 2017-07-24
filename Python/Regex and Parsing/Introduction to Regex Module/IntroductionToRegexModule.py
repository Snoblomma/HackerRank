import re

t = int(input())

for i in range(t):
    print(bool(re.match(r"(?:^[.]{1}[0-9]+|[+-]{1}[0-9]*[.]{1}[0-9]+|[0-9]+[.]{1}[0-9]+$)", input())))
