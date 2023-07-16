public class Substring_less_than_k extends Solution {
    public static void main(String[] args) {
        long[] a={1, 2, 3, 4};

        System.out.println(Solution.countSubArrayProductLessThanK(a,4,10));
    }
}
    class Solution {

        public static int countSubArrayProductLessThanK(long[] a, int n, long k)
        {
            int j=0;
            int ans=0;
            long prod=1;
            for(int i=0;i<n;i++)
            {
                prod*=a[i];

                while(prod>=k && j<=i)
                {
                    prod=prod/a[j];
                    j++;
                }

                if(prod<k)
                {
                    ans+=i-j+1;

                }

            }

            return ans;
        }
    }
