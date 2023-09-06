import java.util.*;
 class Method_overriding {
   void meth()
   {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int l=0,k=0;
        int[] even = new int[n];
        int[] odd = new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even[l]=arr[i];
                l++;
            }
            else
            {
                odd[k]=arr[i];
                k++;
            }
        }
        System.out.println("Even numbers are:");
        for(int i=0;i<l;i++)
        {
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println("Odd numbers are:");
        for(int i=0;i<k;i++)
        {
            System.out.print(odd[i]+" ");
        }

   }
   //main method
    public static void main(String[] args) {
    transpose obj = new transpose();
    obj.meth();
    }
}
class transpose extends Method_overriding
{
 void meth()
 {
  super.meth();
  int[][] mat = new int[3][3];
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of the matrix");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            mat[i][j] = sc.nextInt();
        }
    }
    System.out.println("The matrix is:");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The transpose of the matrix is:");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.print(mat[j][i]+" ");
        }
        System.out.println();
    }
 }
 
   
}