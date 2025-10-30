package Other;

public class Test3 {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        n = 6;
        a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    a[i][j] = 2;
                else if (i == 1 || i == n - 2 || j == 1 || j == n - 2)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        n = 8;
        a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    a[i][j] = 3;
                else if (i == 1 || i == n - 2 || j == 1 || j == n - 2)
                    a[i][j] = 2;
                else if (i == 2 || i == n - 3 || j == 2 || j == n - 3)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
