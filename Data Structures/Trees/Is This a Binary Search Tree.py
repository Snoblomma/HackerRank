def check(root, minVal, maxVal):
    if root != None:
        if root.data >= maxVal or root.data <= minVal:
            return False
        else:
            return check(root.left, minVal, root.data) and check(root.right, root.data, maxVal)
    else:
        return True

def check_binary_search_tree_(root):
    return check(root, 0, 10001)