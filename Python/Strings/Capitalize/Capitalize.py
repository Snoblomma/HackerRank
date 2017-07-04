def capitalize(string):
    k = string.split(" ")
    for i in range(len(k)):
        s = k[i].capitalize()
        k[i] = s
        
    stitch = " "
    for item in k:
        stitch = stitch +  " " + item
    
    stitch = stitch[1::]
        
    return stitch[1::]

if __name__ == '__main__':
    string = input()
    capitalized_string = capitalize(string)
    print(capitalized_string)
