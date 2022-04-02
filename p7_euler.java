/** 
* Juho Salomäki
* juhsalomaki@gmail.com
* 
* Java solution for euler problem 7
* https://projecteuler.net/problem=7
* 
* Executing on command line:
* java p7_euler.java
*
* Answer: 104743
*/

class p7_euler {
    public static void main(String args[]) {
        int target = 10001;
        int n = 0;
        
        //Loop untill target value (10001)
        for (int i = 1; i < target; i++) {
            do {
                n++;
            } while(isPrime(n) == false);
        }

        System.out.println("Result: " + n);
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
