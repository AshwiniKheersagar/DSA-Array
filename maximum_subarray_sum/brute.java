package maximum_subarray_sum;

public class brute {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
               int sum=0;
               for(int k=i;k<=j;k++)
               {
                   sum+=arr[k];
               }
               max=Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
