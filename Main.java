public class Main {

    // Method to determine if a number is prime as well as
    // odd or even. It takes one integer argument and returns a string.
    public static String isPrime(int a) {

        /*
         * For loop that iterates starting with the number 2 and determines if the
         * modulus of int a and "i" is zero or not. Also checks if a number is odd or
         * even with a modulo check
         */
        for (int i = 2; i < a; i++) {

            // Empty string to hold Odd or Even determination message
            String message = "";

            if (a % i == 0 && a % 2 == 0) {
                message = " But it's Even!";
                return "Not a prime Number..." + message;
            } else if (a % i == 0 && a % 2 != 0) {
                message = " and it's Odd!";
                return "Not a prime number..." + message;
            }
        }
        return "That's a prime Number!";
    }

    public static void main(String[] args) {
        // Test Cases for Prime Number method
        System.out.println(isPrime(27));
        System.out.println(isPrime(24));
        System.out.println(isPrime(2));

        // Create new instance of Car and call the move method
        Car car = new Car();
        car.move(5);
        car.move(2);
        car.move(10);

    }

}
