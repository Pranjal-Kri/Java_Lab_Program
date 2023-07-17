import java.util.*;

interface yes { // declare the interface
    int check(int num);
}

class happy implements yes { // implements the interface in a class
    public int check(int num) {
        int rem = 0, sum = 0;
        while (num > 0) // calculate sum of squares of each digit
        {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
}

public class Happy_number {
    public static void main(String args[]) { // main function
        happy obj = new happy(); // creating object
        System.out.println("Enter a number greater than 0");
        Scanner sc = new Scanner(System.in); // taking input
        int number = sc.nextInt();
        int val = number;
        while (val != 1 && val != 4) {
            val = obj.check(val);
        }
        if (val == 1) {
            System.out.println(number + " is a Happy number");
        } else {
            System.out.println(number + " is not a Happy number");
        }
    }
} // class ends