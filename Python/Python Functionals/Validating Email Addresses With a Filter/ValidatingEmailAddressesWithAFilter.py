import re

def fun(s):
    # return True if s is a valid email, else return False
    # Valid email addresses must follow these rules:
    # It must have the username@websitename.extension format type.
    # The username can only contain letters, digits, dashes and underscores.
    # The website name can only have letters and digits.
    # The maximum length of the extension is 3.
    res = True
    if bool(re.search(r'^([a-z0-9-_]+[@]{1}[a-z0-9]+[.]{1}[a-z]{1,3})$', s)) == False:
        res = False
    
    return res 

    
def filter_mail(emails):
    return list(filter(fun, emails))

if __name__ == '__main__':
    n = int(input())
    emails = []
    for _ in range(n):
        emails.append(input())

filtered_emails = filter_mail(emails)
filtered_emails.sort()
print(filtered_emails)
