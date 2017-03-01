You are given a list of *N* people who are attending ACM-ICPC World Finals. Each of them are either well versed in a topic or they are not. Find out the maximum number of topics a 2-person team can know. And also find out how many teams can know that maximum number of topics.

**Note** Suppose a, b, and c are three different people, then (a,b) and (b,c) are counted as two different teams.

###Input Format

The first line contains two integers, *N* and *M*, separated by a single space, where *N* represents the number of people, and *M* represents the number of topics. *N* lines follow.

Each line contains a binary string of length *M*. If the *i*th line's *j*th character is 1, then the *i*th person knows the *j*th topic; otherwise, he doesn't know the topic.

###Constraints 
* 2 ≤ *N* ≤ 500
* 1 ≤ *M* ≤ 500

###Output Format

On the first line, print the maximum number of topics a 2-person team can know. 
On the second line, print the number of 2-person teams that can know the maximum number of topics.