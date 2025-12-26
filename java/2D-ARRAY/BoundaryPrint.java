import java.util.Scanner;

public class BoundaryPrint {

    static void boundary(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;

        // Case 1: Single row
        if (r == 1) {
            for (int i = 0; i < c; i++) {
                System.out.print(arr[0][i] + " ");
            }
        }
        // Case 2: Single column
        else if (c == 1) {
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i][0] + " ");
            }
        }
        // General case
        else {
            // Top row
            for (int i = 0; i < c; i++) {
                System.out.print(arr[0][i] + " ");
            }

            // Right column
            for (int i = 1; i < r; i++) {
                System.out.print(arr[i][c - 1] + " ");
            }

            // Bottom row
            for (int i = c - 2; i >= 0; i--) {
                System.out.print(arr[r - 1][i] + " ");
            }

            // Left column
            for (int i = r - 2; i >= 1; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary elements:");
        boundary(arr);

        sc.close();
    }
}
