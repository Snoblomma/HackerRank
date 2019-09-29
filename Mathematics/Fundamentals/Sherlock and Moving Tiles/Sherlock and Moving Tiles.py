import os
import math

def movingTiles(l, s1, s2, queries):
    m = []
    diff = s2-s1
    l1 = math.sqrt(2*l*l)
    for q in queries:
        qlen = math.sqrt(q)
        q1 = math.sqrt(2*qlen*qlen)
        t = (l1-q1)/abs(diff)
        m.append(t)

    return m

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    lS1S2 = input().split()

    l = int(lS1S2[0])

    s1 = int(lS1S2[1])

    s2 = int(lS1S2[2])

    queries_count = int(input())

    queries = []

    for _ in range(queries_count):
        queries_item = int(input())
        queries.append(queries_item)

    result = movingTiles(l, s1, s2, queries)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()