/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        doFizzBuzz(5);
    }

    public static void doFizzBuzz(int n) {
        int i = 1;

        while (i < 100) {
            boolean divisibleBy3 = i % 3 == 0;     // this boolean constantly checks this for different values of i
            boolean divisibleBy5 = i % 5 == 0;

            // Find out which numbers divide i.

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");


            } else if (divisibleBy3) {

                System.out.println("Fizz");


            } else if (divisibleBy5) {

                System.out.println("Buzz");


            } else {

                System.out.println(i);


            }
            i++; }
    }
}

   
