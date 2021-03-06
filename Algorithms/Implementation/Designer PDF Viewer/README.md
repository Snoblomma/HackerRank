When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue rectangle. In a new kind of PDF viewer, the selection of each word is independent of the other words; this means that each rectangular selection area forms independently around each highlighted word. For example:

![alt text](https://s3.amazonaws.com/hr-challenge-images/22869/1471640108-6c01750b16-PDF-highighting.png "Logo Title Text 1")

In this type of PDF viewer, the *width* of the rectangular selection area is equal to the number of letters in the word times the width of a letter, and the *height* is the maximum height of any letter in the word.

Consider a word consisting of lowercase English alphabetic letters, where each letter is 1*mm* wide. Given the height of each letter in millimeters (*mm*), find the total area that will be highlighted by blue rectangle in *mm*^2 when the given word is selected in our new PDF viewer.

### Input Format

The first line contains 26 space-separated integers describing the respective heights of each consecutive lowercase English letter (i.e., *ha*, *hb*,...*hz*). 

The second line contains a single word, consisting of lowercase English alphabetic letters.

### Constraints

* 1 ≤ *h?* ≤ 7, where ? is an English lowercase letter.
* Word contains no more than 10 letters.

### Output Format

Print a single integer denoting the area of highlighted rectangle when the given word is selected. The unit of measurement for this is square millimeters (*mm*), but you must only print the integer.

### Sample Input
```
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc
```
### Sample Output
```
9
```
### Explanation

We are highlighting the word ```abc```:

1. The tallest letter in ```abc``` is ```b```, and *hb* = 3. The selection area for this word is 3 · 1*mm* · 3*mm* = 9*mm*^2.

**Note:** Recall that the width of each character is 1*mm*.
