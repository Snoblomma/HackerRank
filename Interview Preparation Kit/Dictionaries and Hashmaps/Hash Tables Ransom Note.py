#!/bin/python3

def sublist(note, magazine):
    noteSet = set(note)
    magazineSet = set(magazine)
    
    if noteSet.issubset(magazineSet):
        noteDict = dict([x,note.count(x)] for x in noteSet)
        magazineDict = dict([x,magazine.count(x)] for x in magazineSet)
        for key in noteDict.keys():
            if noteDict[key] > magazineDict[key]:
                return False
        return True
    else:
        return False


def checkMagazine(magazine, note):
    if len(note) > len(magazine):
        print('No')
    else:
        print('Yes' if sublist(note, magazine) == True else 'No')

if __name__ == '__main__':
    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    magazine = input().rstrip().split()

    note = input().rstrip().split()

    checkMagazine(magazine, note)
