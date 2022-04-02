/** 
* Juho Salomäki
* juhsalomaki@gmail.com
* 
* Java solution for euler problem 6
* https://projecteuler.net/problem=6
* 
* Executing on command line:
* node p6_euler.js
*
* Answer: 25164150
*/

/*
    Loop until 100, add square of index to squareSum,
    add index to iSum, calculate square of iSum, 
    find the difference by subtracting squareSum from
    iSquare
*/

let squareSum = 0;
let iSum = 0;

for (let i = 0; i <= 100; i++) {
    squareSum += i ** 2;
    iSum += i;
}

let iSquare = iSum ** 2;
console.log(`Result: ${iSquare - squareSum}`);