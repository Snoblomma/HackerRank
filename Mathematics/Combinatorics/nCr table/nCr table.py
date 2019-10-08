import os

def solve(n):
    line = [1]
    for k in range(n):
        line.append(int(line[k] * (n-k) / (k+1)))
    return line

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = solve(n)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
