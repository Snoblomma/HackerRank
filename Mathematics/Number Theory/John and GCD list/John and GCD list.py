import os

def lcm(x, y):
   if x > y:
       greater = x
   else:
       greater = y

   while(True):
       if((greater % x == 0) and (greater % y == 0)):
           lcm = greater
           break
       greater += 1

   return lcm

def solve(a):
    res = [a[0]]
    for i in range(len(a)-1):
        res.append(lcm(a[i], a[i+1]))
    res.append(a[-1])
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        a_count = int(input())

        a = list(map(int, input().rstrip().split()))

        result = solve(a)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
