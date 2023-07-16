import java.util.*;

public class squares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    if (n <= 0)
      System.out.print("Invalid output");
    else {
      while (n != 0) {
        sum = sum + n * n;
        n--;
      }
    }
    n = temp;
    System.out.println("the no. of squares in a matrix of size " + n + "*" + n + " is " + sum);
    sc.close();
  }
}
