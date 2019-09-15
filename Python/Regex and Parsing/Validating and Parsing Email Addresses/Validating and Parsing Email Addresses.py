import email.utils
import re

def isValidEmail(e):
    emailRegex = r"^[a-z0-9]+[\w\-\.]*\@([a-z]+)\.[a-z]{1,3}$"
    matches = re.search(emailRegex, e)
    if matches:
        return True
    else:
        return False

def validateEmails(emails):
    for e in emails:
        addr = email.utils.parseaddr(e)
        if isValidEmail(addr[1]):
            print(addr[0] + ' <' + addr[1] + '>')

if __name__ == '__main__':
    emails = [input() for _ in range(int(input()))]
    validateEmails(emails) 