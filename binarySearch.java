//Design a java code for implementing bianry serach,pass array as a parameter to the method

import java.util.*;

public class binarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Taking iput from the user
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        // Calling the method
        binarySearch ob = new binarySearch();
        int ans = ob.binarySear(arr, x, 0, n - 1);
        if (ans == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element found at " + (ans + 1) + " position");
        }

        sc.close();

    }

    int binarySear(int a[], int s, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (a[mid] == s)
                return mid;
            if (a[mid] < s)
                return binarySear(a, s, mid + 1, high);
            if (a[mid] > s)
                return binarySear(a, s, low, mid - 1);
        }
        return -1;
    }

}
