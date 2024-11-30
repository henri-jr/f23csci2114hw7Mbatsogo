//906609
public class Mbatsogo 4 {
    public static void main(String[] args) {
        int maxPalindrome = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome) {
                    maxPalindrome = product;
                }
            }
        }

        System.out.println(maxPalindrome); 
    }

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
