import re

T = int(input())

for i in range(T):
    s = input()
    val = "Valid"
    # It must start with a 4, 5 or 6.
    m1 = re.match(r'^[456]', s)
    if bool(m1) == False:
        val = "Invalid"
    
    # It must contain exactly 16 digits. 
    # It must only consist of digits (0-9). 
    # It may have digits in groups of 4, separated by one hyphen "-". 
    # It must NOT use any other separator like ' ' , '_', etc. 
    m2 = re.match(r'^\b[0-9]{4}[-]{0,1}[0-9]{4}[-]{0,1}[0-9]{4}[-]{0,1}[0-9]{4}\b$', s)
    if bool(m2) == False:
        val = "Invalid"
    
    # It must NOT have 4 or more consecutive repeated digits.   
    s = re.sub("\D", "", s)    
    m3 = re.findall(r'(\d)\1{3}', s)    
    if bool(m3) == True:
        val = "Invalid"
        #print("4 consec")
        
    print(val)
