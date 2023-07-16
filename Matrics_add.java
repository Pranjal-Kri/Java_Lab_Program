import java.util.*;

class sum {
    void add(int a[][], int b[][], int m, int n) {
        int i, j;
        int res[][] = new int[m][n];
        System.out.println("Matrix after addition");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    } // method 'add' ends
} // class 'sum' ends

public class Matrics_add {
    // main function
    public static void main(String args[]) {
        System.out.println("Enter no. of rows & cols");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // row input
        int n = sc.nextInt(); // column input
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        System.out.println("Enter Matrix 1");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Matrix 2");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        sum obj = new sum(); // creating obect
        obj.add(a, b, m, n); // method calling
    }
}