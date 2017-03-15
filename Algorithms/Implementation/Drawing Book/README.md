Brie’s Drawing teacher asks her class to open their *n*-page book to page number *p*. Brie can either start turning pages from the front of the book (i.e., page number 1) or from the back of the book (i.e., page number *n*), and she always turns pages one-by-one (as opposed to skipping through multiple pages at once). When she opens the book, page 1 is always on the right side:

<p><img src="https://s3.amazonaws.com/hr-challenge-images/0/1481920803-d2b54f38f0-book.png" alt="Smiley face" align="center"></p>

Each page in the book has two sides, front and back, except for the last page which may only have a front side depending on the total number of pages of the book (see the *Explanation* sections below for additional diagrams).

Given *n* and *p*, find and print the minimum number of pages Brie must turn in order to arrive at page *p*.

### Input Format

The first line contains an integer, *n*, denoting the number of pages in the book. 
The second line contains an integer, *p*, denoting the page that Brie's teacher wants her to turn to.

### Constraints

* 1 ≤ *n* ≤ 10^5
* 1 ≤ *p* ≤ *n*

### Output Format

Print an integer denoting the minimum number of pages Brie must turn to get to page *p*.

### Sample Input 0
```
6
2
```
### Sample Output 0
```
1
```
### Explanation 0

If Brie starts turning from page 1, she only needs to turn 1 page:

![alt text](https://s3.amazonaws.com/hr-challenge-images/22564/1467398713-1decf68d06-UntitledDiagram6.png "Logo Title Text 1")

If Brie starts turning from page 6, she needs to turn 2 pages:

![alt text](https://s3.amazonaws.com/hr-challenge-images/22564/1467397150-52d0a8213b-UntitledDiagram3.png "Logo Title Text 1")

Because we want to print the minumum number of page turns, we print 1 as our answer.

### Sample Input 1
```
5
4
```
### Sample Output 1
```
0
```
### Explanation 1

If Brie starts turning from page 1, she needs to turn 2 pages:

![alt text](https://s3.amazonaws.com/hr-challenge-images/22564/1467398281-32b69f6fa9-UntitledDiagram4.png "Logo Title Text 1")

If Brie starts turning from page 5, she doesn't need to turn any pages:

![alt text](https://s3.amazonaws.com/hr-challenge-images/22564/1467398392-5d9ac72e45-UntitledDiagram5.png "Logo Title Text 1")

Because we want to print the minimum number of page turns, we print 0 as our answer.
