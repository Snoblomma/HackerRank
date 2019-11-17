#!/bin/python3

import os
import sys

class SinglyLinkedListNode:
    def __init__(self, node_data):
        self.data = node_data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert_node(self, node_data):
        node = SinglyLinkedListNode(node_data)

        if not self.head:
            self.head = node
        else:
            self.tail.next = node


        self.tail = node

def print_singly_linked_list(node, sep, fptr):
    while node:
        fptr.write(str(node.data))

        node = node.next

        if node:
            fptr.write(sep)

def compare_lists(llist1, llist2):
    while llist1 or llist2:
        if llist1 and llist2:
            if llist1.data != llist2.data:
                return False
            else:
                llist1 = llist1.next
                llist2 = llist2.next
        else:
            return False
    return True

if __name__ == '__main__':