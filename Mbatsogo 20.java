//648
import java.math.BigInteger;
public class FactorialDigitSum {
    public static void main(String[] args) {
        BigInteger factorial = factorial(100);
        
        String factorialStr = factorial.toString();
        int digitSum = 0;
        
        for (int i = 0; i < factorialStr.length(); i++) {
            digitSum += Character.getNumericValue(factorialStr.charAt(i));
        }
        
        System.out.println("The sum of the digits in 100! is: " + digitSum);
    }
    
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
