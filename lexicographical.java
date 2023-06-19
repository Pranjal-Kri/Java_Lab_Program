//Write a java program to accept 5 strings from the user and print them in lexicographical order

import java.util.*;
class lexicographical
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        //taking string input from user
        System.out.println("Enter 5 String ");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextLine().toLowerCase();
        }

        //sorting the string using the sort method
        // Arrays.sort(arr);

        //By using the for loop
        for(int i=0;i<2;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        //printing the string
        System.out.println("LEXICOGRAPHICALY  order is :");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
                }
            
            sc.close();
        }
}