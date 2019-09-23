import os

def flippingBits(n):
    binary = ''
    for bit in bin(n+2**32)[-32:]:
        binary += '1' if bit == '0' else '0'

    return int(binary, 2)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        n = int(input())

        result = flippingBits(n)

        fptr.write(str(result) + '\n')

    fptr.close()
