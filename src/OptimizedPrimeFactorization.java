public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        long starTime = System.currentTimeMillis();
        int i = 2;
        int count = 0;
        while (count <= 50) {
            if (checkPrime(i)) {
                System.out.println("Prime - " + i);
                count++;
            }
            i++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("OptimizedPrimeFactorization's time: " + (endTime - starTime) + " milliseconds" + "\n=================");

    }

    private boolean checkPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
