import os

def canConstruct(a): 
    result= ''
    for element in a:
        result += str(element)

    k = 0
    for r in result:
        k += int(r)

    return "Yes" if k%3==0 else "No"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        a = list(map(int, input().rstrip().split()))

        result = canConstruct(a)

        fptr.write(result + '\n')

    fptr.close()
