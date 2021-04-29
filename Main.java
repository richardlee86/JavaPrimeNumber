public class Main {

    public static String isPrime(int a) {
        for (int i = 2; i < a; i++) {
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
        // Test Cases
        System.out.println(isPrime(27));
        System.out.println(isPrime(24));
        System.out.println(isPrime(2));
    }

}
