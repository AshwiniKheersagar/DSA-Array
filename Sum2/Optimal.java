package Sum2;

import java.util.Arrays;

public class Optimal 
{
    public static void main(String[] args) 
    {
        int[] arr={2,6,5,8,11};
        int target=10;
        int n=arr.length;

        Arrays.sort(arr);
        int l=0,r=n-1;
        while (l<r) 
        {
            int sum=arr[l]+arr[r];
            if(sum==target)
            {
                System.out.println("true");
                return;
            }
            else if(sum>target)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        System.out.println("flase");
    }
}
