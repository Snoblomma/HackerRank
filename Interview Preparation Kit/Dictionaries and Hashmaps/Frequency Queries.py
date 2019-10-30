import os

def freqQuery(queries):
    arr = {}
    res = []
    for query in queries:
        print(query)
        operation = query[0]
        n = query[1]
        if operation == 1:
            if n not in arr.keys():
                arr[n] = 1
            else:
                arr[n] += 1
        elif operation == 2:
            if n in arr.keys():
                arr[n] -= 1
                if arr[n] == 0:
                    arr.pop(n)
        elif operation == 3:
            count = 0
            for key in arr.keys():
                if arr[key] == n:
                    count = 1
                    break
            res.append(count)  
        print(arr)
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    ans = freqQuery(queries)

    fptr.write('\n'.join(map(str, ans)))
    fptr.write('\n')

    fptr.close()
