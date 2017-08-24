import sys
import xml.etree.ElementTree as etree

def get_attr_number(node):
    sum = 0
    for element in tree.iter():
        sum += len(node.attrib)
    return sum
    
if __name__ == '__main__':
    sys.stdin.readline()
    xml = sys.stdin.read()
    tree = etree.ElementTree(etree.fromstring(xml))
    root = tree.getroot()
    print(get_attr_number(root))
