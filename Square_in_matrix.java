import java.util.*;

public class Square_in_matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of square matrix");
        int size = sc.nextInt();
        int temp=size;
        int sum = 0;
        if (size < 1) {
            System.out.println("Invalid size");
        } else {
            while (size != 0) {
                sum += size * size;
                size--;
            }
        }
        System.out.println("Total number of square matrix in " + temp + " is: " + sum);
    }
}