import os

def solve(cards):
    l = len(cards)
    res = 1
    for i, c in enumerate(cards):
        val = l - c
        if val <= 0:
            return 0
        res = (res * (val - i)) % 1000000007
    return res 

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        c_count = int(input())
        cards = list(map(int, input().strip().split()))
        cards.sort(reverse=True)
        result = solve(cards)
        fptr.write(str(result) + '\n')

    fptr.close()
