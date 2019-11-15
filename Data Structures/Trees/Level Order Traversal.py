class Node:
    def __init__(self, info): 
        self.info = info  
        self.left = None  
        self.right = None 
        self.level = None 

    def __str__(self):
        return str(self.info) 

class BinarySearchTree:
    def __init__(self): 
        self.root = None

    def create(self, val):  
        if self.root == None:
            self.root = Node(val)
        else:
            current = self.root
         
            while True:
                if val < current.info:
                    if current.left:
                        current = current.left
                    else:
                        current.left = Node(val)
                        break
                elif val > current.info:
                    if current.right:
                        current = current.right
                    else:
                        current.right = Node(val)
                        break
                else:
                    break

def height(node): 
    if node is None: 
        return 0 
    else : 
        lheight = height(node.left) 
        rheight = height(node.right) 

        if lheight > rheight : 
            return lheight+1
        else: 
            return rheight+1

levelOrderList = []

def levelOrder(root):
    h = height(root) 
    for i in range(1, h+1): 
        printGivenLevel(root, i)
    print(' '.join(str(s) for s in levelOrderList))

def printGivenLevel(root, level): 
    if root is None: 
        return
    if level == 1: 
        levelOrderList.append(root.info)
    elif level > 1 : 
        printGivenLevel(root.left , level-1) 
        printGivenLevel(root.right , level-1) 

tree = BinarySearchTree()
t = int(input())

arr = list(map(int, input().split()))

for i in range(t):
    tree.create(arr[i])

levelOrder(tree.root)