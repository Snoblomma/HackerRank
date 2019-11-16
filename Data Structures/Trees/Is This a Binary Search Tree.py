isTree = True
treeNodes = []

def isLess(root, node):
    global isTree
    global treeNodes
    if node:
        treeNodes.append(node.data)
        if node.data >= root.data:
            isTree = False
        else:
            if node.left:
                if node.left.data >= node.data:
                    isTree = False
                else:
                    isLess(root, node.left)
            if node.right:
                if node.right.data <= node.data:
                    isTree = False
                else:
                    isLess(root, node.right)
            
def isMore(root, node):
    global isTree
    global treeNodes
    if node:
        treeNodes.append(node.data)
        if node.data <= root.data:
            isTree = False
        else:
            if node.left:
                if node.left.data >= node.data:
                    isTree = False
                else:
                    isMore(root, node.left)
            if node.right:
                if node.right.data <= node.data:
                    isTree = False
                else:
                    isMore(root, node.right)

def check_binary_search_tree_(root):
    global isTree
    global treeNodes
    treeNodes.append(root.data)
    if root.left:
        isLess(root, root.left)
    if root.right:
        isMore(root, root.right)

    isTree = False if len(set(treeNodes)) != len(treeNodes) else isTree
    return isTree
