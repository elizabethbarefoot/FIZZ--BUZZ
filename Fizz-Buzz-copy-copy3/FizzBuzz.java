
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
     static void fizzBuzz(int N) {
    // Stores count of multiples
    // of 3 and 5 respectively
    int count3 = 0;
    int count5 = 0;
    for (int i = 1; i <= N; i++) {
        count3++;
        count5++;
        boolean flag = false;
        
        if (count5 == 5 && count3 == 3) {
            System.out.println("FizzBuzz");
            count5 = 0;
            count3 = 0;
            flag = true;
        }
        
        // Check if the value of count3
        // is equal to 3
        if (count3 == 3) {
            System.out.println("Fizz");
            count3 = 0;
            flag = true;
        }
 
        // Check if the value of count5
        // is equal  to 5
        if (count5 == 5) {
            System.out.println("Buzz");
            count5 = 0;
            flag = true;
        }
        
        if (!flag) {
            System.out.println(i);
        }
    }
}
}
