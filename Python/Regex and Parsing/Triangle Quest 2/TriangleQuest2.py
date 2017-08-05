for i in range(1,int(input())+1): #More than 2 lines will result in 0 score. Do not leave a blank line also
    print("".join(str(abs(abs(i-s)-i))for s in range(1, 2*i)))
