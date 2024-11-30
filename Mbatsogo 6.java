//25164150
public class Mbatsogo 6 {
    public static void main(String[] args) {
        int n = 100; // You can change this value for different n
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        int squareOfSum = sum * sum;

        int difference = squareOfSum - sumOfSquares;
        System.out.println("The difference is: " + difference);  
    }
}
