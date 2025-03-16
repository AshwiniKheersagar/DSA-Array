package maximum_subarray_sum;

public class better {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
              sum+=arr[j];
              max=Math.max(max, sum);
            }
           
        }
        System.out.println(max);
    }
}
