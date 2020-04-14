public class LazyPrimeFactorization implements Runnable {
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
        System.out.println("LazyPrimeFactorization's time: " + (endTime - starTime) + " milliseconds" + "\n=================");

    }

    private boolean checkPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
