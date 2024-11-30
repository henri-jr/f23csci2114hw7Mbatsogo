
public class Mbatsogo 11 {
    public static void main(String[] args) {
        int[][] grid = {
            { 8,  2, 22, 97, 38, 15,  0, 40,  0, 75,  4,  5,  7, 78, 52, 12, 50, 77, 91, 8 },
            {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48,  4, 56, 62, 0 },
            {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30,  3, 49, 13, 36, 65},
            {52, 70, 95, 23,  4, 60, 11, 42, 69, 72, 17,  8, 46, 55,  8, 71, 89,  7,  4, 42},
            {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
            {24, 47, 32, 60, 99,  3, 45,  2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
            {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 47},
            {23,  3, 11, 42, 30, 44, 73,  3, 49, 13, 36, 65, 52, 70, 62, 16, 10,  6, 79, 71},
            {28, 11, 14, 22, 73, 35, 29,  1,  1, 17, 16, 29, 10, 79, 42, 94, 23, 63, 78, 17},
            {52, 70, 95, 23,  4, 60, 11, 42, 69, 72, 17,  8, 46, 55,  8, 71, 89,  7,  4, 42}
        };

        int maxProduct = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j + 3 < grid[i].length) {
                    int horizontal = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                    maxProduct = Math.max(maxProduct, horizontal);
                }
                if (i + 3 < grid.length) {
                    int vertical = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
                    maxProduct = Math.max(maxProduct, vertical);
                }
                if (i + 3 < grid.length && j + 3 < grid[i].length) {
                    int diagonal1 = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                    maxProduct = Math.max(maxProduct, diagonal1);
                }
                if (i + 3 < grid.length && j - 3 >= 0) {
                    int diagonal2 = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
                    maxProduct = Math.max(maxProduct, diagonal2);
                }
            }
        }

        System.out.println("The largest product is: " + maxProduct);
    }
}
