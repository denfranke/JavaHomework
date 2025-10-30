package Other;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int n = 5;
        int[][] array = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}};

        for (int[] row : array) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }

        int min = array[0][0], x = 0, y = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i != j && array[i][j] < min) {
                    min = array[i][j];
                    x = i;
                    y = j;
                }
            }
        System.out.println(min + " x=" + x + " y=" + y);
    }
}
