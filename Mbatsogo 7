//104743
public class Mbatsogo 7 {
    public static void main(String[] args) {
        int count = 0; 
        int number = 1; 
        int nth = 10001; 

        while (count < nth) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println(number);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
