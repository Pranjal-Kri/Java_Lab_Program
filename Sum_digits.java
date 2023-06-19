///Write a java code to find digit sum of two-digit number until the digit sum is less than 10

import java.util.Scanner;

public class Sum_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,sum=0;
        System.out.println("Enter the number : ");
        number=sc.nextInt();
        while(number!=0)
        {
            while (number!=0)
            {
                sum+=number%10;
                number/=10;

            }
            if(sum>=10)
            {
                System.out.println("Sum="+sum);
                number=sum;
                sum=0;
            }
        }
        System.out.println("Sum of digits in single digit is = "+sum);
    }
}
 