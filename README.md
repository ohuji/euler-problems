# Project Euler problem solutions
This repository contains solutions for Project Euler problems 6, 7, 10.

https://projecteuler.net/

Two of the solutions are written in Java and one in JavaScript.

Time complexity is O(1) for all of them of course, since all problems have constant target value.

## Solution for Project Euler problem #6: Sum square difference
This solution was written in JavaScript.

https://projecteuler.net/problem=6

[Source](https://github.com/ohuji/euler-problems/blob/main/p6_euler.js)

Executing in commandline with node.js installed:
https://nodejs.org/en/

```
node p6_euler.js

Result: 25164150
Time: 7.86ms
```

This solution is simple. 

Using console.time it takes around 8ms to find the solution. It scales fairly well, with 1million it takes under 20ms of time.

## Solution for Project Euler problem #7: 10001st prime
This solution was written in Java.

https://projecteuler.net/problem=7

[Source](https://github.com/ohuji/euler-problems/blob/main/p7_euler.java)

Executing in commandline with Java installed:
https://www.java.com/en/download/help/download_options.html

```
java p7_euler.java

Result: 104743
Time: 16ms
```
Using System.currentTimeMillis() it takes around 16ms for the solution. The solution runs ok time with 10001, but it wouldn't scale that well with larger numbers.

## Solution for Project Euler problem #10: Summation of primes
This solution was written in Java.

https://projecteuler.net/problem=10

[Source](https://github.com/ohuji/euler-problems/blob/main/p10_euler.java)

Executing in commandline with Java installed:
https://www.java.com/en/download/help/download_options.html

```
java p10_euler.java

Result: 142913828922
Time: 614ms
```
Im using the same function for checking prime numbers as in #7 solution.

It is kind of straight forward solution of just checking primes and until target and summing them. 

Using System.currentTimeMillis() it takes around 614ms for the solution. It takes a lot more time since the target is 2mil. 

