import heapq

def qheap1(queries):
    res = []
    heapq.heapify(res)
    for query in queries:
        operation = query[0]  
        if operation == 1:
            heapq.heappush(res, query[1])
        elif operation == 2:
            res.remove(query[1])
            heapq.heapify(res)
        elif operation == 3:
            print(res[0])
    return res

if __name__ == '__main__':
    q = int(input().strip())

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    qheap1(queries)