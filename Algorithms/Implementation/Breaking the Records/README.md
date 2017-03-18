Maria plays *n* games of college basketball in a season. Because she wants to go pro, she tracks her points scored per game sequentially in an array defined as *score* = [*s0*, *s1*,..*sn-1*]. After each game *i*, she checks to see if score *si* breaks her record for most or least points scored so far during that season.

Given Maria's array of *scores* for a season of *n* games, find and print the number of times she breaks her record for *most* and *least* points scored during the season.

**Note**: Assume her records for most and least points at the start of the season are the number of points scored during the first game of the season.

### Input Format

The first line contains an integer denoting *n* (the number of games). 

The second line contains *n* space-separated integers describing the respective values of *s0*, *s1*,.. *sn-1*.

### Constraints

* 1 ≤ *n* ≤ 1000
* 0 ≤ *si* ≤ 10^8

### Output Format

Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.

### Sample Input 0
```
9
10 5 20 20 4 5 2 25 1
```
### Sample Output 0
```
2 4
```

### Sample Input 1
```
10
3 4 21 36 10 28 35 5 24 42
```
### Sample Output 1
```
4 0
```
