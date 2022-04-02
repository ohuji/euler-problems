/** 
* Juho Salomäki
* juhsalomaki@gmail.com
* 
* Java solution for euler problem 10
* https://projecteuler.net/problem=10
* 
* Executing on command line:
* java p10_euler.java
*
* Answer: 142913828922
*/

class p10_euler {
    public static void main(String args[]) {
        long sum = 2;
        int target = 2000000;

        /*
            Loop numbers till target number (2mil)
            if isPrime returns true, add number to the sum
        */
        for (int i = 0; i <= target; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Result: " + sum);
    }

    //Function for checking if the given number is prime or not
    public static boolean isPrime(int n) {
        /* 
            If number is less than 2 then return false,
            since prime numbers can't be negative, 0 or 1.
            This is kind of unneccesary since could
            just start the loop from index 2. But now
            this method would be reusable, so I prefer
            it this way
        */
        if (n < 2) {
            return false;
        }

        //Check if given number is multiple of 2
        if (n % 2 == 0) {
            return false;
        }

        /*
            Loop until square root of given number
            if given number is multiple of index
            return false
        */
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}