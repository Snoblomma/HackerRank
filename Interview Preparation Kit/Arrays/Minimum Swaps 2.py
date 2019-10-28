import os

def minimumSwaps(arr):
    N = len(arr)
    swappedPairs = 0
   
    for i in range(N):
        if arr[i] != i+1:
            k = arr[i]-1
            m = arr[k]
            if arr[m-1] == arr[i]:
                arr[k], arr[i] = arr[i], arr[k]       
            else:
                s = arr.index(i+1, i)
                arr[s], arr[i] = arr[i], arr[s]       
            swappedPairs += 1
            
    return swappedPairs

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = minimumSwaps(arr)

    fptr.write(str(res) + '\n')

    fptr.close()
