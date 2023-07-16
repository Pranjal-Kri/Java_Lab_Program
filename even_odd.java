import java.util.*;
//super class to separate even & odd elements
class Evenodd {
    void meth() {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0, l = 0;
        int a[] = new int[x];
        int even[] = new int[x];
        int odd[] = new int[x];
        System.out.println("Enter array elements");
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < x; i++) {
            if (a[i] % 2 == 0) {
                even[k] = a[i];
                k++;
            } else {
                odd[l] = a[i];
                l++;
            }
        }
        System.out.println("Even Matrix");
        for (int i = 0; i < k; i++) {
            System.out.print(even[i] + "\t");
        }
        System.out.println();
        System.out.println("Odd Matrix");
        for (int i = 0; i < l; i++) {
            System.out.print(odd[i] + "\t");
        }
        System.out.println();
    } // meth ends
} // class ends
// subclass to find transpose

class Transpose extends Evenodd {
    void meth() {
        super.meth(); // calling Evenodd()'s meth
        System.out.println("Enter rows & cols");
        Scanner t = new Scanner(System.in);
        int m = t.nextInt();
        int n = t.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        System.out.println("Enter a 2D array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = t.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.println("Transpose of matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    } // meth ends
} // class ends

public class even_odd {
    // main function
    public static void main(String args[]) {
        Transpose obj = new Transpose();
        obj.meth(); // calling transpose meth()
    } // main ends
}