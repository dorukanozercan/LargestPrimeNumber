public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime (int number) {
        if (number < 0) {
            return -1;
        }
        int result = 0;
        for (int i = number; i > 0; i--) {
            if (number % i == 0 && isPrime(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static boolean isPrime (int number) {
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
