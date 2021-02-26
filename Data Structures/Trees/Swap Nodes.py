from typing import List
import sys

sys.setrecursionlimit(2000)


class Node:
    def __init__(self, value): 
        self.value = value 
        self.left = None  
        self.right = None 

    def __str__(self):
        return str(self.info) 

def swap(root: Node, tree: List[Node], k: int, depth=1): 
    if depth % k == 0: 
        root.left, root.right = root.right, root.left

    if root.left is not None:
        swap(root.left, tree, k, depth + 1)

    print(root.value, end=' ')

    if root.right is not None:
        swap(root.right, tree, k, depth + 1)

def swap_nodes(): 
    n = int(input()) 
    nodes = [Node(i) for i in range(1, n + 1)]

    for i in range(n):
        left, right = map(int, input().split())
        if left != -1:
            nodes[i].left = nodes[left - 1]
        if right != -1:
            nodes[i].right = nodes[right - 1]

    root = nodes[0]

    t = int(input())
    for _ in range(t):
        k = int(input())
        tree = []
        swap(root, tree, k)
        print(*tree)

if __name__ == '__main__':
    swap_nodes()