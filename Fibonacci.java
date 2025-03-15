public class Fibonacci {
    public static long computeFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <n>");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
                return;
            }

            long result = computeFibonacci(n);
            System.out.println("Fibonacci(" + n + ") = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
