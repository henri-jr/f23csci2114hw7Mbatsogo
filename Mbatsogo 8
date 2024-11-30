//23514624000
public class Mbatsogo 8 {
    public static void main(String[] args) {
        String number = 
            "7316717653133062491922511967754654958537"; 
        int n = 13;
        
        long maxProduct = 0;

        for (int i = 0; i <= number.length() - n; i++) {
            long product = 1;
            
            for (int j = i; j < i + n; j++) {
                product *= Character.getNumericValue(number.charAt(j));
            }
            
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println("The largest product of " + n + " consecutive digits is: " + maxProduct);
    }
}
