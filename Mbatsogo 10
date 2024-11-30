//142913828922
public class Mbatsogo 10 {
    public static void main(String[] args) {
        int limit = 2000000;
        boolean[] primes = new boolean[limit];
        
        for (int i = 2; i < limit; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i < limit; i++) {
            if (primes[i]) {
                for (int j = i * i; j < limit; j += i) {
                    primes[j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i < limit; i++) {
            if (primes[i]) {
                sum += i;
            }
        }

        System.out.println(sum); 
    }
}
