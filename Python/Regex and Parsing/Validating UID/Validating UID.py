import re

T = int(input())

for i in range(T):
    UID = input()
    no_repeating_characters = r'^(?:([A-Za-z0-9])(?!.*\1))*$'
    other_rules = r'^(?=(.*[A-Z]){2,})(?=(.*[0-9]){3,}).{10}$'
    no_repeating_characters_match = bool(re.search(no_repeating_characters, UID))
    other_rules_match = bool(re.search(other_rules, UID))
    if no_repeating_characters_match == True and other_rules_match == True:
        print("Valid")
    else:
        print("Invalid")
