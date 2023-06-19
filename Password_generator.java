//design an java code which accepts a Room Number , Mobile Number and Name of the Customer and generate a 6 Character Unique Password

import java.util.*;

public class Password_generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw;
        System.out.println("Enter the Room Number");
        int rno = sc.nextInt();
        System.out.println("Enter the Mobile Number");
        long mobile = sc.nextLong();
        System.out.println("Enter the Name of the Customer");
        String name = sc.next();
        char[] special = { ')', ',', '@', '#', '$', '%', '^', '&', '*', '(', '!', '+' };
        int sum = 0, rno1 = rno;
        do {
            while (rno != 0) {
                sum = sum + rno % 10;
                rno /= 10;
            }
            if (sum >= 10) {
                rno = sum;
                sum = 0;
            }
        } while (rno != 0);
        int c = rno1 / 100;
        int len = name.length();
        int pos = 0;
        for (int i = 0; i < len; i++) {
            if (c == i) {
                pos = i-1;
                System.out.println("Password is :");
            }
        }
        pw=""+name.charAt(0)+mobile%10+sum+special[pos]+name.charAt(len-1);
        System.out.println(pw);
    }
}
