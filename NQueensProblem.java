import java.util.*;

public class NQueensProblem {
    public static boolean isSafe(int arr[][], int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (arr[i][j] == 1)
                return false;
        }
        return true;
    }

    public static boolean solveNQueens(int arr[][], int row, int n) {
        if (row == n)
            return true;

        for (int col = 0; col < n; col++) {
            if (isSafe(arr, row, col, n)) {
                arr[row][col] = 1;

                if (solveNQueens(arr, row + 1, n))
                    return true;

                arr[row][col] = 0; 
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens : ");
        n = sc.nextInt();
        int arr[][] = new int[n][n];

        if (solveNQueens(arr, 0, n)) {
            System.out.println("Solution Exists:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No Solution Exists");
        }
    }
}
