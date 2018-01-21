public class Fib {
    static int fib(int n) {
        if (n < 3)
            return 1;
        else
            return fib(n -2) + fib(n - 1);
    }

    public static void main(String[] args) {
        long tStart = System.currentTimeMillis();
        System.out.printf("fib(40) = %d\n", fib(40));
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.printf("Elapsed time: %g\n", elapsedSeconds);
    }
}
