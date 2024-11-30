//1366
import java.math.BigInteger;
public class Mbatsogo 16 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(2).pow(1000);
        String numberStr = number.toString();
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Character.getNumericValue(numberStr.charAt(i));
        }
        System.out.println(sum);  // Output: 1366
    }
}
