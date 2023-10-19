
/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz
{// Driver Code
public static void main(String[] args)
{
    int N = 100;
    fizzBuzz(N);
}
     static void fizzBuzz(int N)
{
   
    // Stores count of multiples
    // of 3 and 5 respectively
    int count3 = 0;
    int count5 = 0;
 
    // Iterate from 1 to N
    for (int i = 1; i <= N; i++) {
 
        // Increment count3 by 1
        count3++;
 
        // Increment count5 by 1
        count5++;
 
        // Initialize a boolean variable
        // to check if none of the
        // condition matches
        boolean flag = false;
 
        // Check if the value of count3
        // is equal to 3
        if (count3 == 3) {
            System.out.print("Fizz");
 
            // Reset count3 to 0, and
            // set flag as True
            count3 = 0;
            flag = true;
        }
 
        // Check if the value of count5
        // is equal  to 5
        if (count5 == 5) {
            System.out.print("Buzz");
 
            // Reset count5 to 0, and
            // set flag as True
            count5 = 0;
            flag = true;
        }
 
        // If none of the condition matches
        if (!flag) {
            System.out.print(i);
        }
 
        System.out.print(" ");
    }
}
}
