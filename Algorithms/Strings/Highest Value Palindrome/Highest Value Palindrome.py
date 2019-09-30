import math
import os
import random
import re
import sys

def maxDiff(a1, a2, mid, k, d):
    a11 = []
    a21 = []
    for i in a1:
        a11.append(int(i))
    
    for i in a2:
        a21.append(int(i))

    for i in range(len(a11)):
        if a11[i] != a21[i]:
            if k - d >= 2:
                if a11[i] != 9:
                    a11[i] = 9
                    k -= 1

                if a21[i] != 9:
                    a21[i] = 9
                    k -= 1
                d -= 1
                 
            elif k - d == 1:
                if a11[i] == 9 or a21[i] == 9:
                    if a11[i] != 9:
                        a11[i] = 9
                        k -= 1

                    if a21[i] != 9:
                        a21[i] = 9
                        k -= 1
                    d -= 1
      
                else:
                    a11[i] = 9
                    a21[i] = 9
                    d -= 1
                    k -= 2

            elif a11[i] != a21[i] and k - d == 0:
                if a11[i] > a21[i]:
                    a21[i] = a11[i]
                else:
                    a11[i] = a21[i]
                d -= 1
                k -= 1

        elif a11[i] == a21[i] and a11[i] != 9 and k - d >= 2:
            a11[i] = 9
            a21[i] = 9
            k -= 2
    
    if mid !=None and k>0:
        mid = 9
    else:
        mid = ''

    str1 = ''.join(str(e) for e in a11)
    str2 = ''.join(str(e) for e in a21[::-1])
    return str1 + str(mid) + str2

def diff(a1, a2):
    res = 0
    for i in range(len(a1)):
        if a1[i] != a2[i]:
            res +=1
    return res

def highestValuePalindrome(s, n, k):
    a1 = s[:n//2]
    a2 = s[(n//2 + n%2):][::-1]
    mid = s[(n//2)] if n%2 == 1 else None
    d = diff(a1, a2) 
    if d > k:
        return "-1"
    else:
        return maxDiff(a1, a2, mid, k, d)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    s = input()

    result = highestValuePalindrome(s, n, k)

    fptr.write(result + '\n')

    fptr.close()
