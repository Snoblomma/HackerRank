import heapq

def qheap1(queries):
    res = []
    lookup = set()

    heapq.heapify(res)
    for query in queries:
        operation = query[0]  
        if operation == 1:
            heapq.heappush(res, query[1])
            lookup.add(query[1])
        elif operation == 2:
            lookup.discard(query[1])
        elif operation == 3:
            while res[0] not in lookup:
                heapq.heappop(res)
            print(res[0])

    return res

if __name__ == '__main__':
    q = int(input().strip())

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    qheap1(queries)