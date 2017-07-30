import re

T = int(input())

comm_started = False

for i in range(T):
    s = input()
    
    
    if "-->" in s and "<!--" in s:
        comm_started = False 
        s = ""
    
    if "-->" in s:
        comm_started = False  
    if "<!--" in s:
        comm_started = True

    
    if comm_started == False:
        matches = re.finditer(r'([<]{1}([a-z0-9]+))|(["]{1}([\w\-.,\/\s:;=]+)["]{1})|(([\w\-.,\/\:;=]+)[=]{1})', s)
        k1 = ""
        k2 = ""
        for match in matches:
            
            if match.group(2) != None:
                print(match.group(2))
            
            if match.group(4) != None:
                    k1 = match.group(4)
            if match.group(6) != None:
                    k2 = match.group(6)
            if k1 != "" and k2 != "":
                    print("-> " + k2 + " > " + k1)
                    k1 = ""
                    k2 = ""
